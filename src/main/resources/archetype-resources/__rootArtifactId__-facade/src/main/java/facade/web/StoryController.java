#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.facade.web;

import ${package}.model.vo.HistoryEventVO;
import ${package}.app.service.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoryController {

    @Autowired
    private StoryService storyService;

    @RequestMapping("/story")
    public HistoryEventVO performs() {
        storyService.reset();
        storyService.performs();
        return storyService.queryHistory();
    }

}
