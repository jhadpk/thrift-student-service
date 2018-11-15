package com.inmobi.thriftself.service.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Getter
public enum StudentStatusEnum {
    ACTIVE,
    ALUMNI;

    @Override
    public String toString() {
        return this.name();
    }
}
