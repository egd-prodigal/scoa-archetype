#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.domain.object;

import ${package}.model.domain.General;
import ${package}.event.HistoryEvent;
import ${package}.repository.mapper.CampMapper;
import ${package}.repository.mapper.PeopleMapper;
import ${package}.util.YearUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class GeneralObject extends General {

    private final Logger logger = LoggerFactory.getLogger(GeneralObject.class);

    @Autowired
    private PeopleMapper peopleMapper;

    @Autowired
    private CampMapper campMapper;

    @Autowired
    private ApplicationContext applicationContext;


    @Override
    public void kill(General enemy) {
        campMapper.deadCampGenerals(enemy);
        peopleMapper.updateDead(enemy.getFirstName(), enemy.getLastName(), enemy.getStyleName(), YearUtils.getCurrentYear());
        applicationContext.publishEvent(new HistoryEvent("关羽于万军丛中取颜良首级"));
    }

    @Override
    public void speak(String words) {
        logger.info("{}曰：{}", getStyleName(), words);
    }

}
