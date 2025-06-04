package com.yun.fieta_b.etf.enums;

public enum EtfTheme {

    USA("미국"),
    KOREA("한국"),
    REITS("리츠 (부동산)"),
    MULTI_ASSET("멀티에셋"),
    COMMODITIES("원자재/실물"),
    HIGH_RISK("고위험"),
    SECTOR("산업별/섹터"),
    DIVIDEND("배당형"),
    ESG("ESG"),
    AI_DATA("AI·데이터"),
    GOLD("금"),
    GOVERNMENT_BOND("국채"),
    CORPORATE_BOND("회사채"),
    DEFENSE("방위"),
    SEMICONDUCTOR("반도체"),
    BIO("바이오"),
    EMERGING_MARKETS("신흥국");

    private final String displayName;

    EtfTheme(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    // displayName으로 EtfTheme Enum을 찾는 메서드
    // 존재하지 않는 이름이면 IllegalArgumentException 발생
    public static EtfTheme fromDisplayName(String displayName) {
        for (EtfTheme theme : EtfTheme.values()) {
            if (theme.getDisplayName().equals(displayName)) {
                return theme;
            }
        }
        throw new IllegalArgumentException("존재하지 않는 테마 이름입니다: " + displayName);
    }
}