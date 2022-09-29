#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.app.listener;

import ${package}.app.command.HistoryEventCmdExe;
import ${package}.event.HistoryEvent;
import ${package}.util.YearUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class HistoryEventListener implements ApplicationListener<HistoryEvent> {

    @Autowired
    private HistoryEventCmdExe historyEventCmdExe;

    @Override
    public void onApplicationEvent(HistoryEvent event) {
        String history = (String) event.getSource();
        historyEventCmdExe.record(YearUtils.getCurrentYear(), history);
    }

}
