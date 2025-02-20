package com.floristeria.floristeria_app.application.primaryports.interactor;

public interface InteractorWithReturn <T, R> {
    R execute(T data);
}
