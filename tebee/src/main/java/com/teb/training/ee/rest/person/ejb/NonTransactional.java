package com.teb.training.ee.rest.person.ejb;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.transaction.Transactional;


@Retention(RUNTIME)
@Target({
          TYPE,
          FIELD,
          METHOD
})
@Transactional
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
public @interface NonTransactional {

}
