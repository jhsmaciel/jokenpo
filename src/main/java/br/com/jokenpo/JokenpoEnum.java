package br.com.jokenpo;


public enum JokenpoEnum {
    PAPEL(1),
    TESOURA(2),
    PEDRA(3);

    private final int rawValue;

    JokenpoEnum(int rawValue) {
        this.rawValue = rawValue;
    }

    public int getRawValue() {
        return rawValue;
    }

    public boolean equals(JokenpoEnum jokenpoEnum) {
        return this.rawValue == jokenpoEnum.rawValue;
    }

}
