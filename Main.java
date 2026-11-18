public class Main {
    public static void main(String[] args) {
        GradeCalculator calculator = new GradeCalculator();
        GradeReportPrinter printer = new GradeReportPrinter();

        GradeRepository repository =
                new ConsoleGradeRepository();

        double nilai = calculator.hitungNilaiAkhir(80, 85, 90);

        printer.cetakLaporan("Andi", nilai);
        repository.simpan("Andi", nilai);
    }
}