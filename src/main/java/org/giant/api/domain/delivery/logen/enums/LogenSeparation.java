package org.giant.api.domain.delivery.logen.enums;

/**
 * Logen 구분자 열거형
 * Logen 응답 리스폰이 모두 문자형 + 구분자 조합임
 */
public enum LogenSeparation {

    S1("\u039E"), S2("\u2261"), S3("\u3013");

    private final String separation;

    LogenSeparation(String separation) {
        this.separation = separation;
    }

    public String get() {
        return this.separation;
    }
}
