#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.api;

import ${package}.client.dto.GeneralInfoDTO;

/**
 * 将领信息查询客户端
 */
public interface GeneralQueryClient {

    /**
     * 查询将领信息
     *
     * @param firstName 姓
     * @param lastName  名
     * @param styleName 字
     * @return 将领
     */
    GeneralInfoDTO queryGeneral(String firstName, String lastName, String styleName);

}
