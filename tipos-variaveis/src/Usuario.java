public class Usuario {
    public static void main(String[] args) throws Exception {
        SmatTv smatTv = new SmatTv();

        smatTv.statusTv();

        smatTv.ligar();
        smatTv.aumentarVolume();
        smatTv.aumentarVolume();
        smatTv.aumentarVolume();
        smatTv.mudarCanal(12);

        System.out.println("Agora o novo status da Tv é:");
        smatTv.statusTv();

        
    }
}
