#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.api;

import ${package}.client.dto.GeneralInfoDTO;

public interface GeneralQueryClient {

    GeneralInfoDTO queryGeneral(String firstName, String lastName, String styleName);

}
