#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.repository.mapper;

import ${package}.model.domain.People;
import ${package}.repository.entity.CampPO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CampMapper {

    @Select("select * from camp where lord = ${symbol_pound}{firstName} || ${symbol_pound}{lastName}")
    List<CampPO> queryCampGenerals(People lord);

    @Delete("delete from camp where firstName = ${symbol_pound}{firstName} and lastName = ${symbol_pound}{lastName} and styleName = ${symbol_pound}{styleName}")
    int deadCampGenerals(People general);

}
