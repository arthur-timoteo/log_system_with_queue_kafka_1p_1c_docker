package github.arthur.lswqd.entities;

public class ExampleOneEntity {

    private int parameterOne;
    private String parameterTwo;

    public ExampleOneEntity(){}

    public ExampleOneEntity(int parameterOne, String parameterTwo){
        this.parameterOne = parameterOne;
        this.parameterTwo = parameterTwo;
    }

    public int getParameterOne(){
        return this.parameterOne;
    }

    public String getParameterTwo(){
        return this.parameterTwo;
    }

    public void setParameterOne(int parameterOne){
        this.parameterOne = parameterOne;
    }

    public void setParameterTwo(String parameterTwo){
        this.parameterTwo = parameterTwo;
    }

}
