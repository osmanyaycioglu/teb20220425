package com.teb.training.ee.rest.error;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ConstraintViolationHandler implements ExceptionMapper<ConstraintViolationException> {

    @Override
    public Response toResponse(final ConstraintViolationException exceptionParam) {
        ErrorObj errorObjLoc = new ErrorObj().setDesc("Validasyon patladı")
                                             .setErrorCode(10002);
        Set<ConstraintViolation<?>> c = exceptionParam.getConstraintViolations();
        for (ConstraintViolation<?> constraintViolationLoc : c) {
            errorObjLoc.addSubError(new ErrorObj().setDesc(constraintViolationLoc.toString())
                                                  .setErrorCode(10003));
        }

        return Response.status(Status.BAD_REQUEST)
                       .header("Content-Type",
                               MediaType.APPLICATION_JSON)
                       .entity(errorObjLoc)
                       .build();
    }

}
