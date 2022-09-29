#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.repository.mapper;

import ${package}.repository.entity.PeoplePO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface PeopleMapper {

    @Select("select * from people where firstName = ${symbol_pound}{firstName} and lastName = ${symbol_pound}{lastName} and styleName = ${symbol_pound}{styleName}")
    PeoplePO query(@Param("firstName") String firstName, @Param("lastName") String lastName, @Param("styleName") String styleName);

    @Update("update people set dead = ${symbol_pound}{dead} where firstName = ${symbol_pound}{firstName} and lastName = ${symbol_pound}{lastName} and styleName = ${symbol_pound}{styleName}")
    int updateDead(@Param("firstName") String firstName, @Param("lastName") String lastName,
                   @Param("styleName") String styleName, @Param("dead") String dead);

}
