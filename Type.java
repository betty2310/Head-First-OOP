public enum Type {
    ASCOUTIC, ELECTRIC;

    public String toString() {
        switch (this) {
            case ASCOUTIC:
                return "acoustic";
            case ELECTRIC:
                return "electric";
            default:
                return "unspecified";
        }
    }
}
