#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.app.command.query;

import ${package}.model.domain.General;
import ${package}.model.factory.DomainObjectFactory;
import ${package}.repository.mapper.PeopleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 将领查询器
 */
@Component
public class GeneralQueryExe {

    @Autowired
    private PeopleMapper peopleMapper;

    /**
     * 根据姓、名、字查询
     *
     * @param firstName 姓
     * @param lastName  名
     * @param styleName 字
     * @return General 将领
     */
    public General queryByName(String firstName, String lastName, String styleName) {
        return DomainObjectFactory.create(General.class, g -> {
            g.setPeople(peopleMapper.query(firstName, lastName, styleName));
        });
    }

}
