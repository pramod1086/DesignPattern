package org.example.designpattern.builderdesignpattern.java8;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class GenericBuilder <T>{

    private final Supplier <T> supplier;

    GenericBuilder(Supplier <T> supplier){
        this.supplier = supplier;
    }


    public static  <T> GenericBuilder<T> of(Supplier<T> supplier){
        return new GenericBuilder<>(supplier);

    }

    public <P> GenericBuilder<T> with(BiConsumer<T,P> builder,P value){
        return new GenericBuilder(()->{
            T object = supplier.get();
            builder.accept(object,value);
            return object;
        });
    }

    public T build() {
        return supplier.get();
    }

}
