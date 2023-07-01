public record Tojas(String termekNeve, String mennyiseg, int egysegAr, boolean hatosagiArasE, String ketegoria) {
    @Override
    public String toString() {
        return "Tojas{" +
                "termekNeve='" + termekNeve + '\'' +
                ", mennyiseg='" + mennyiseg + '\'' +
                ", egysegAr=" + egysegAr +
                ", hatosagiArasE=" + hatosagiArasE +
                ", ketegoria='" + ketegoria + '\'' +
                '}';
    }
}
