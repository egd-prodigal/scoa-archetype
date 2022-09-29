#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.model.domain;

// 战士，战争参与者
public interface Warrior {

    void kill(General enemy);

    default void speak(String words) {
        System.out.println(words);
    }

}