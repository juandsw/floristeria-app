package com.floristeria.floristeria_app.application.usecase;

public interface UsecaseWithoutReturn <D>{

    void execute(D domain);
}
