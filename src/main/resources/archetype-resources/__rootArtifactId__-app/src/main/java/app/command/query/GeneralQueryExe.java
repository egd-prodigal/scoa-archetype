#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.app.command.query;

import ${package}.model.domain.General;
import ${package}.model.factory.DomainObjectFactory;
import ${package}.repository.mapper.PeopleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GeneralQueryExe {

    @Autowired
    private PeopleMapper peopleMapper;

    public General queryByName(String firstName, String lastName, String styleName) {
        return DomainObjectFactory.create(General.class, g -> {
            g.setPeople(peopleMapper.query("关", "羽", "云长"));
        });
    }

}
