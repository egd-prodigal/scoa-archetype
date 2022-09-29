#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.app.service;

import ${package}.model.vo.HistoryEventVO;

public interface StoryService {

    void performs();

    void reset();

    HistoryEventVO queryHistory();

}
