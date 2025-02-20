package com.floristeria.floristeria_app.application.usecase;

public interface UsecaseWithReturn <D, R>{

    R execute(D domain);
}
