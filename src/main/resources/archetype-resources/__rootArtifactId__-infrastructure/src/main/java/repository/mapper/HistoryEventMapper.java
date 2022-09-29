#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.repository.mapper;

import ${package}.repository.entity.HistoryEventPO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface HistoryEventMapper {

    @Insert("insert into history (reign_title, history) values (${symbol_pound}{reignTitle}, ${symbol_pound}{history})")
    int insert(HistoryEventPO po);

    @Delete("delete from history")
    int deleteAll();

    @Select("select reign_title reignTitle, history history from history where rownum = 1")
    HistoryEventPO query();

}
