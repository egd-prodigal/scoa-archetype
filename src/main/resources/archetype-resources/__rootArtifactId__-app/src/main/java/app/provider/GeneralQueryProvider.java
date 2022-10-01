#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.app.provider;

import ${package}.app.command.query.GeneralQueryExe;
import ${package}.client.api.GeneralQueryClient;
import ${package}.client.dto.GeneralInfoDTO;
import ${package}.model.domain.General;
import ${package}.model.domain.People;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 将领信息查询客户端实现
 */
public class GeneralQueryProvider implements GeneralQueryClient {
    @Autowired
    private GeneralQueryExe generalQueryExe;

    /**
     * 查询将领信息
     *
     * @param firstName 姓
     * @param lastName  名
     * @param styleName 字
     * @return 将领
     */
    @Override
    public GeneralInfoDTO queryGeneral(String firstName, String lastName, String styleName) {
        General general = generalQueryExe.queryByName(firstName, lastName, styleName);
        GeneralInfoDTO dto = new GeneralInfoDTO();
        dto.setName(general.getFirstName() + general.getLastName());
        dto.setBirthAndDead("生于" + (People.BIRTH_DEAD_NOT_RECORD.equals(general.getBirth()) ? "不详" : general.getBirth())
                + "卒于" + general.getDead());
        return dto;
    }

}
