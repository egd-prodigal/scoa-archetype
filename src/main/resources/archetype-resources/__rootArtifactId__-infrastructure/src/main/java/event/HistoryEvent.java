#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.event;

import org.springframework.context.ApplicationEvent;

public class HistoryEvent extends ApplicationEvent {

    public HistoryEvent(Object source) {
        super(source);
    }

}
