package com.teb.training.java.oo.lambda.collection.processor;

import java.util.ArrayList;
import java.util.List;

public class MyCollectionProcessor<T> {

    // private final IProcess<T> pros;
    private final List<T> list = new ArrayList<>();

    public MyCollectionProcessor() {
    }
    //    public MyCollectionProcessor(final IProcess<T> prosParam) {
    //        this.pros = prosParam;
    //    }

    public MyCollectionProcessor<T> add(final T t) {
        this.list.add(t);
        return this;
    }

    public MyCollectionProcessor<T> process(final IProcess<T> pros) {
        for (T tLoc : this.list) {
            pros.process(tLoc);
        }
        return this;
    }

    public MyCollectionProcessor<T> processData(final IProcessData<T> pros) {
        for (int iLoc = 0; iLoc < this.list.size(); iLoc++) {
            T tLoc = this.list.get(iLoc);
            this.list.remove(iLoc);
            this.list.add(iLoc,
                          pros.process(tLoc));
        }
        return this;
    }


}
