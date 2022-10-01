#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.domain.object;

import ${package}.model.domain.Camp;
import ${package}.model.domain.General;
import ${package}.repository.entity.CampPO;
import ${package}.repository.entity.PeoplePO;
import ${package}.repository.mapper.CampMapper;
import ${package}.repository.mapper.PeopleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 阵营领域对象
 */
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CampObject extends Camp {

    @Autowired
    private CampMapper campMapper;

    @Autowired
    private PeopleMapper peopleMapper;

    /**
     * 查看阵营的将领们
     *
     * @return java.util.List
     */
    @Override
    public List<General> getGenerals() {
        if (super.generals == null) {
            List<CampPO> campPOS = campMapper.queryCampGenerals(getLord());
            setGenerals(campPOS.stream().map(camp -> {
                General general = new GeneralObject();
                PeoplePO peoplePO = peopleMapper.query(camp.getFirstName(), camp.getLastName(), camp.getStyleName());
                general.setPeople(peoplePO);
                general.setCamp(this);
                return general;
            }).collect(Collectors.toList()));
        }
        return super.generals;
    }

}
