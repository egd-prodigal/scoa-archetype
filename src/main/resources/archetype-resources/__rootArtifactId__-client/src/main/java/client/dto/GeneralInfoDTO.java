#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.dto;

public class GeneralInfoDTO {

    private String name;

    private String birthAndDead;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthAndDead() {
        return birthAndDead;
    }

    public void setBirthAndDead(String birthAndDead) {
        this.birthAndDead = birthAndDead;
    }
}
