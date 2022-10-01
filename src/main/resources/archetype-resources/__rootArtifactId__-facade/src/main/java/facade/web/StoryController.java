#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.facade.web;

import ${package}.app.service.StoryService;
import ${package}.model.vo.HistoryEventVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制器，提供rest接口
 */
@RestController
public class StoryController {

    @Autowired
    private StoryService storyService;

    /**
     * 演绎历史故事
     *
     * @return HistoryEventVO 历史事件
     */
    @RequestMapping("/story")
    public HistoryEventVO performs() {
        storyService.reset();
        storyService.performs();
        return storyService.queryHistory();
    }

}
