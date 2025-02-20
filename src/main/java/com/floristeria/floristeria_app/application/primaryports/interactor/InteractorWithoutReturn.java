package com.floristeria.floristeria_app.application.primaryports.interactor;

public interface InteractorWithoutReturn <T> {

    void execute(T data);
}
