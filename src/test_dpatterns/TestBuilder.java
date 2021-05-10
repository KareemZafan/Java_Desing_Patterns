package test_dpatterns;

import design_patterns.builder.BuilderPattern;

public class TestBuilder {
    public static void main(String[] args) {
        BuilderPattern.Builder builder = new BuilderPattern.Builder() ;
        builder.bread("wheat" ).condiments("Lettuce").dressing("Mayo").meat("Turkey") ;

        BuilderPattern builderPattern = builder.build() ;

        System.out.println(builderPattern.getBread());
        System.out.println(builderPattern.getCondiments());
        System.out.println(builderPattern.getDressing());
        System.out.println(builderPattern.getMeat());


    }

}
