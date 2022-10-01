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

/**
 * 阵营任务的数据库访问接口
 */
@Mapper
public interface CampMapper {

    /**
     * 查询某某阵营里的人物
     *
     * @param lord 主公
     * @return java.util.List 阵营人物
     */
    @Select("select * from camp where lord = ${symbol_pound}{firstName} || ${symbol_pound}{lastName}")
    List<CampPO> queryCampGenerals(People lord);

    /**
     * 删除阵营将领
     *
     * @param general 将领
     * @return int
     */
    @Delete("delete from camp where firstName = ${symbol_pound}{firstName} and lastName = ${symbol_pound}{lastName} and styleName = ${symbol_pound}{styleName}")
    int deadCampGenerals(People general);

}
