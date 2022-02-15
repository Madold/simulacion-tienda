// import java.util.Scanner;
// import java.util.regex.Matcher;
// import java.util.regex.Pattern;

// public class Tienda {
//     private String nombreUsuario;
//     private float monto;
//     private float precioBaseCPU;
//     private float precioBaseGPU;
//     private float precioBasePlacaMadre;
//     private float precioBaseMemoriaRam;
//     private float precioBaseFuentePoder;
//     private float precioBaseAlmacenamiento;
//     private float pagoTotal;
//     private int seleccion = -1;

//     Scanner entrada = new Scanner(System.in);
//     Catalogos obj = new Catalogos();

//     public Tienda(String nombreUsuario, float monto) {
//         this.setNombreUsuario(nombreUsuario);
//         this.setMonto(monto);
//         setPagoTotal(0);
//         setPrecioBaseCPU(0);
//         setPrecioBaseGPU(0);
//         setPrecioBasePlacaMadre(0);
//         setPrecioBaseMemoriaRam(0);
//         setPrecioBaseAlmacenamiento(0);
//     }

//     public float getPagoTotal() {
//         return pagoTotal;
//     }

//     public void setPagoTotal(float pagoTotal) {
//         this.pagoTotal = pagoTotal;
//     }

//     public float getPrecioBaseAlmacenamiento() {
//         return precioBaseAlmacenamiento;
//     }

//     public void setPrecioBaseAlmacenamiento(float precioBaseAlmacenamiento) {
//         this.precioBaseAlmacenamiento = precioBaseAlmacenamiento;
//     }

//     public float getPrecioBaseMemoriaRam() {
//         return precioBaseMemoriaRam;
//     }

//     public void setPrecioBaseMemoriaRam(float precioBaseMemoriaRam) {
//         this.precioBaseMemoriaRam = precioBaseMemoriaRam;
//     }

//     public float getPrecioBasePlacaMadre() {
//         return precioBasePlacaMadre;
//     }

//     public void setPrecioBasePlacaMadre(float precioBasePlacaMadre) {
//         this.precioBasePlacaMadre = precioBasePlacaMadre;
//     }

//     public float getPrecioBaseFuentePoder() {
//         return precioBaseFuentePoder;
//     }

//     public void setPrecioBaseFuentePoder(float precioBaseFuentePoder) {
//         this.precioBaseFuentePoder = precioBaseFuentePoder;
//     }

//     public float getPrecioBaseGPU() {
//         return precioBaseGPU;
//     }

//     public void setPrecioBaseGPU(float precioBaseGPU) {
//         this.precioBaseGPU = precioBaseGPU;
//     }

//     public String getNombreUsuario() {
//         return nombreUsuario;
//     }

//     public void setNombreUsuario(String nombreUsuario) {
//         this.nombreUsuario = nombreUsuario;
//     }

//     public float getPrecioBaseCPU() {
//         return precioBaseCPU;
//     }

//     public void setPrecioBaseCPU(float precioBaseCPU) {
//         this.precioBaseCPU = precioBaseCPU;
//     }

//     public float getMonto() {
//         return monto;
//     }

//     public void setMonto(float monto) {
//         this.monto = monto;
//     }

//     /*********************** Validaciones **********************/
//     public boolean validarMonto(String monto) {

//         boolean ok = false;

//         Pattern regex = Pattern.compile("^[0-9]{1,40}");
//         Matcher mathc = regex.matcher(monto);

//         if (mathc.matches()) {
//             ok = true;
//         }
//         return ok;
//     }

//     public boolean validarOpcion(String opcion) {
//         boolean ok = false;

//         Pattern regex = Pattern.compile("^[0-9]{1,10}");
//         Matcher mathc = regex.matcher(opcion);

//         if (mathc.matches()) {
//             ok = true;
//         }
//         return ok;
//     }

//     /*********************** Métodos principales **********************/
//     public void mostrarMenu() {
//         System.out.println();
//         System.out.println("=====Menu de Interacción=====");
//         System.out.println();
//         System.out.println("=====Listado de productos====\n" +
//                 "1. CPUs\n"
//                 + "2. GPUs\n"
//                 + "3. Placas Madres\n"
//                 + "4. Memorias RAM\n"
//                 + "5. Fuentes de poder\n"
//                 + "6. Almacenamiento\n"
//                 + "7. Salir\n");

//         /* Programando la interfaz */
//         System.out.println();
//         System.out.print("Seleccione un numero del listado de productos para ver su catalogo: ");
//         int opcion = Integer.parseInt(entrada.nextLine().trim());

//         while (opcion < 1 || opcion > 7) {
//             System.out.println();
//             System.out.println("██╗\n"
//                     + "██║\n"
//                     + "██║\n"
//                     + "╚═╝\n"
//                     + "██╗\n"
//                     + "╚═╝\n");
//             System.out.print(" ¡ERROR :c! Escoja un numero correcto del listado: ");
//             opcion = Integer.parseInt(entrada.nextLine().trim());
//         }
//         evaluarOpcion(opcion);
//     }

//     public void mostrarProcesamientoAccion() {
//         System.out.println();
//         System.out.println("Procesando Accion...");
//         System.out.print("El producto se añadió correctamente al carrito :)");
//         System.out.println();
//         mostrarMenu();
//     }

//     public void evaluarOpcion(int opcion) {

//         if (/* CPUS */opcion == 1) {
//             System.out.println("Seleccione una marca por su numero: 1. AMD    2. Intel ");
//             System.out.print("Si quiere regresar, escriba 0 -->: ");

//             int cpuMarca = Integer.parseInt(entrada.nextLine().trim());

//             if (cpuMarca == 1) {
//                 obj.mostrarCPUsAmd();

//                 System.out.print("Selecione un producto para comprar, deacuerdo a su numero\n"
//                         + "Si quiere volver escriba 0: ");

//                 seleccion = Integer.parseInt(entrada.nextLine().trim());

//                 if (seleccion == 0) {
//                     evaluarOpcion(opcion);
//                 } else {
//                     if (seleccion == 1) {
//                         // AMD Ryzen 3 3200G
//                         precioBaseCPU += 250_000;
//                     } else if (seleccion == 2) {
//                         // AMD Ryzen 3 3300
//                         precioBaseCPU += 315_000;
//                     } else if (seleccion == 3) {
//                         // AMD Ryzen 3 3300X
//                         precioBaseCPU += 350_000;
//                     } else if (seleccion == 4) {
//                         // AMD Ryzen 3 3400g
//                         precioBaseCPU += 390_000;
//                     } else if (seleccion == 5) {
//                         // AMD Ryzen 5 3600
//                         precioBaseCPU += 540_000;
//                     } else if (seleccion == 6) {
//                         // AMD Ryzen 5 4600X
//                         precioBaseCPU += 590_000;
//                     } else if (seleccion == 7) {
//                         // AMD Ryzen 7 3700
//                         precioBaseCPU += 840_000;
//                     } else if (seleccion == 8) {
//                         // AMD Ryzen 7 3700X
//                         precioBaseCPU += 890_000;
//                     } else if (seleccion == 9) {
//                         // AMD Ryzen 7 3800
//                         precioBaseCPU += 930_000;
//                     } else if (seleccion == 10) {
//                         // AMD Ryzen 7 3800X
//                         precioBaseCPU += 1_000_000;
//                     } else if (seleccion == 11) {
//                         // AMD Ryzen 9 3900
//                         precioBaseCPU += 2_200_000;
//                     } else if (seleccion == 12) {
//                         // AMD Ryzen 9 3900X
//                         precioBaseCPU += 2_715_000;
//                     } else if (seleccion == 13) {
//                         // AMD Ryzen 9 3950X
//                         precioBaseCPU += 2_575_000;
//                     } else if (seleccion == 14) {
//                         // AMD Ryzen 9 3950XT
//                         precioBaseCPU += 2_715_000;
//                     }

//                     mostrarProcesamientoAccion();
//                 }

//             } else if (cpuMarca == 2) {
//                 obj.mostrarCPUsIntel();
//                 System.out.print("Selecione un producto para comprar, deacuerdo a su numero\n"
//                         + "Si quiere volver escriba 0: ");
//                 seleccion = Integer.parseInt(entrada.nextLine().trim());

//                 if (seleccion == 0) {
//                     evaluarOpcion(opcion);
//                 } else {
//                     if (seleccion == 1) {
//                         // Core i3 10100
//                         precioBaseCPU += 285_000;
//                     } else if (seleccion == 2) {
//                         // Core i3 10100F
//                         precioBaseCPU += 260_000;
//                     } else if (seleccion == 3) {
//                         // Core i5 10400
//                         precioBaseCPU += 345_000;
//                     } else if (seleccion == 4) {
//                         // Core i5 10400F
//                         precioBaseCPU += 325_000;
//                     } else if (seleccion == 5) {
//                         // Core i5 10600
//                         precioBaseCPU += 360_000;
//                     } else if (seleccion == 6) {
//                         // Core i5 10600K
//                         precioBaseCPU += 400_000;
//                     } else if (seleccion == 7) {
//                         // Core i7 10700
//                         precioBaseCPU += 890_000;
//                     } else if (seleccion == 8) {
//                         // Core i7 10700K
//                         precioBaseCPU += 945_000;
//                     } else if (seleccion == 9) {
//                         // Core i9 10900
//                         precioBaseCPU += 2_400_000;
//                     } else if (seleccion == 10) {
//                         // Core i9 10900K
//                         precioBaseCPU += 3_000_000;
//                     }
//                     mostrarProcesamientoAccion();
//                 }
//             } else if (cpuMarca == 0) {
//                 mostrarMenu();
//             }

//         } else if (/* GPUS */opcion == 2) {
//             System.out.print("Seleccione una marca por su numero: 1. Nvidia   2. AMD --> ");
//             System.out.print("Si quiere regresar, escriba 0 -->: ");

//             int gpuMarca = Integer.parseInt(entrada.nextLine().trim());

//             if (gpuMarca == 1) {
//                 obj.mostrarGPUsNvidia();

//                 System.out.print("Selecione un producto para comprar, deacuerdo a su numero\n"
//                         + "Si quiere volver escriba 0: ");
//                 seleccion = Integer.parseInt(entrada.nextLine().trim());

//                 if (seleccion == 0) {
//                     evaluarOpcion(opcion);
//                 } else {
//                     if (seleccion == 1) {
//                         // Nvidia GTX 1030
//                         precioBaseGPU += 500_000;
//                     } else if (seleccion == 2) {
//                         // Nvidia GTX 1050
//                         precioBaseGPU += 575_000;
//                     } else if (seleccion == 3) {
//                         // Nvidia GTX 1050TI
//                         precioBaseGPU += 655_000;
//                     } else if (seleccion == 4) {
//                         // Nvidia GTX 1060
//                         precioBaseGPU += 716_000;
//                     } else if (seleccion == 5) {
//                         // Nvidia GTX 1060super
//                         precioBaseGPU += 800_000;
//                     } else if (seleccion == 6) {
//                         // Nvidia GTX 1060TI
//                         precioBaseGPU += 895_000;
//                     } else if (seleccion == 7) {
//                         // Nvidia RTX 2060
//                         precioBaseGPU += 1_500_000;
//                     } else if (seleccion == 8) {
//                         // Nvidia RTX 2060 super
//                         precioBaseGPU += 1_800_000;
//                     } else if (seleccion == 9) {
//                         // Nvidia RTX 2080
//                         precioBaseGPU += 2_800_000;
//                     } else if (seleccion == 10) {
//                         // Nvidia RTX 2080TI
//                         precioBaseGPU += 3_500_000;
//                     }
//                     mostrarProcesamientoAccion();
//                 }

//             } else if (gpuMarca == 2) {
//                 obj.mostrarGPUsAMD();

//                 System.out.print("Selecione un producto para comprar, deacuerdo a su numero\n"
//                         + "Si quiere volver escriba 0: ");
//                 seleccion = Integer.parseInt(entrada.nextLine().trim());

//                 if (seleccion == 0) {
//                     evaluarOpcion(opcion);
//                 } else {
//                     if (seleccion == 1) {
//                         // AMD Radeon RX 6800
//                         precioBaseGPU += 400_000;
//                     } else if (seleccion == 2) {
//                         // AMD Radeon RX 6800X
//                         precioBaseGPU += 530_000;
//                     } else if (seleccion == 3) {
//                         // AMD Radeon RX 6800XT
//                         precioBaseGPU += 620_000;
//                     } else if (seleccion == 4) {
//                         // AMD Radeon RX 6700
//                         precioBaseGPU += 700_000;
//                     } else if (seleccion == 5) {
//                         // AMD Radeon RX 6600
//                         precioBaseGPU += 980_000;
//                     }
//                     mostrarProcesamientoAccion();
//                 }

//             } else if (gpuMarca == 0) {
//                 mostrarMenu();
//             }
//         } else if (/* MotherBoard */opcion == 3) {
//             System.out.print("Seleccione una marca: 1.GYGABITE    2.MSI --> ");
//             System.out.print("Si quiere regresar, escriba 0 -->: ");

//             int boardMarca = Integer.parseInt(entrada.nextLine().trim());

//             if (boardMarca == 1) {
//                 obj.mostrarBoardGygabyte();

//                 System.out.print("Selecione un producto para comprar, deacuerdo a su numero\n"
//                         + "Si quiere volver escriba 0: ");
//                 seleccion = Integer.parseInt(entrada.nextLine().trim());

//                 if (seleccion == 0) {
//                     evaluarOpcion(opcion);
//                 } else {
//                     if (seleccion == 1) {
//                         // Gygabyte Z690 Gaming X
//                         precioBasePlacaMadre += 1_500_000;
//                     } else if (seleccion == 2) {
//                         // Gygabyte X570S Gaming X
//                         precioBasePlacaMadre += 816_000;
//                     } else if (seleccion == 3) {
//                         // Gygabyte B660 Gaming X AX
//                         precioBasePlacaMadre += 690_000;
//                     }

//                     mostrarProcesamientoAccion();
//                 }

//             } else if (boardMarca == 2) {
//                 obj.mostrarBoardMSI();

//                 System.out.print("Selecione un producto para comprar, deacuerdo a su numero\n"
//                         + "Si quiere volver escriba 0: ");
//                 seleccion = Integer.parseInt(entrada.nextLine().trim());

//                 if (seleccion == 0) {
//                     evaluarOpcion(opcion);
//                 } else {
//                     if (seleccion == 1) {
//                         // MSI MPG Z590
//                         precioBasePlacaMadre += 800_000;
//                     } else if (seleccion == 2) {
//                         // MSI MPG Z490
//                         precioBasePlacaMadre += 950_000;
//                     } else if (seleccion == 3) {
//                         // MSI MPG Z690
//                         precioBasePlacaMadre += 1_200_000;
//                     } else if (seleccion == 4) {
//                         // MSI MPG Z590
//                         precioBasePlacaMadre += 1_500_000;
//                     } else if (seleccion == 5) {
//                         // MSI MAG B550
//                         precioBasePlacaMadre += 1_000_000;
//                     }

//                     mostrarProcesamientoAccion();
//                 }
//             } else if (boardMarca == 0) {
//                 mostrarMenu();
//             }

//         } else if (/* Memorias RAM */opcion == 4) {
//             obj.mostrarMemoriaRAM();

//             System.out.print("Selecione un producto para comprar, deacuerdo a su numero\n"
//                     + "Si quiere volver escriba 0: ");

//             seleccion = Integer.parseInt(entrada.nextLine().trim());
//             if (seleccion == 0) {
//                 mostrarMenu();
//             } else {
//                 int unidades = 1;

//                 if (seleccion == 1) {
//                     System.out.print("¿Cuantas unidades compraras?");
//                     unidades = Integer.parseInt(entrada.nextLine().trim());

//                     // XLR9 Gaming Epic-X RGB 8GB 3200MHZ
//                     precioBaseMemoriaRam += (245_000 * unidades);
//                 } else if (seleccion == 2) {
//                     System.out.print("¿Cuantas unidades compraras?");
//                     unidades = Integer.parseInt(entrada.nextLine().trim());
//                     // Spectrix D41 Gamer RGB 16GB 3600MHZ
//                     precioBaseMemoriaRam += (515_000 * unidades);
//                 } else if (seleccion == 3) {
//                     System.out.print("¿Cuantas unidades compraras?");
//                     unidades = Integer.parseInt(entrada.nextLine().trim());
//                     // Fury Beast (Color negro) 4GB 2400MHZ
//                     precioBaseMemoriaRam += (176_000 * unidades);
//                 } else if (seleccion == 4) {
//                     System.out.print("¿Cuantas unidades compraras?");
//                     unidades = Integer.parseInt(entrada.nextLine().trim());
//                     // Vengeance (Color negro) 32 GB 560Mhz
//                     precioBaseMemoriaRam += (790_000 * unidades);
//                 } else if (seleccion == 5) {
//                     System.out.print("¿Cuantas unidades compraras?");
//                     unidades = Integer.parseInt(entrada.nextLine().trim());
//                     // Hyper X Fury 8GB 3600MHZ
//                     precioBaseMemoriaRam += (314_000 * unidades);
//                 }

//                 mostrarProcesamientoAccion();
//             }

//         } else if (/* Fuentes de Poder */opcion == 5) {
//             obj.mostrarFuentes();
//             System.out.print("Selecione un producto para comprar, deacuerdo a su numero\n"
//                     + "Si quiere volver escriba 0: ");
//             seleccion = Integer.parseInt(entrada.nextLine().trim());

//             if (seleccion == 0) {
//                 mostrarMenu();
//             } else {
//                 if (seleccion == 1) {
//                     // COUGAR VTC 400w Certificación 80 plus gold
//                     precioBaseFuentePoder += 312_000;
//                 } else if (seleccion == 2) {
//                     // Corsair SF 600w Gold Modular
//                     precioBaseFuentePoder += 400_000;
//                 } else if (seleccion == 3) {
//                     // Cougar AURIC 750w Certificacion 80 Plus Gold
//                     precioBaseFuentePoder += 450_000;
//                 } else if (seleccion == 4) {
//                     // EVGA Supernona 1000w certificacion 80 plus gold
//                     precioBaseFuentePoder += 600_000;
//                 } else if (seleccion == 5) {
//                     // MEVGA Supernona 1300w certificacion 80 plus gold
//                     precioBaseFuentePoder += 830_000;
//                 }

//                 mostrarProcesamientoAccion();
//             }

//         } else if (/* Almacenamiento */opcion == 6) {
//             System.out.println("Seleccione un tipo de almacenamiento: 1. HDD   2. SSD");
//             System.out.print("Si quiere regresar, escriba 0 -->: ");
//             int almacennamientoOpcion = Integer.parseInt(entrada.nextLine().trim());

//             if (almacennamientoOpcion == 1) {
//                 obj.mostrarCatalogoHDD();

//                 System.out.print("Selecione un producto para comprar, deacuerdo a su numero\n"
//                         + "Si quiere volver escriba 0: ");
//                 seleccion = Integer.parseInt(entrada.nextLine().trim());

//                 if (seleccion == 0) {
//                     evaluarOpcion(opcion);
//                 } else {
//                     if (seleccion == 1) {
//                         // Disco duro Seagate 500GB
//                         precioBaseAlmacenamiento += 80_000;
//                     } else if (seleccion == 2) {
//                         // Disco duro Kingston 250GB
//                         precioBaseAlmacenamiento += 70_000;
//                     } else if (seleccion == 3) {
//                         // Disco duro Western Digital 1TB
//                         precioBaseAlmacenamiento += 200_000;
//                     } else if (seleccion == 4) {
//                         // Disco duro SanDisk 500GB
//                         precioBaseAlmacenamiento += 160_000;
//                     } else if (seleccion == 5) {
//                         // Disco duro SeaGate 2TB
//                         precioBaseAlmacenamiento += 300_000;
//                     }

//                     mostrarProcesamientoAccion();
//                 }

//             } else if (almacennamientoOpcion == 2) {
//                 obj.mostrarCatalogoSSD();

//                 System.out.print("Selecione un producto para comprar, deacuerdo a su numero\n"
//                         + "Si quiere volver escriba 0: ");
//                 seleccion = Integer.parseInt(entrada.nextLine().trim());

//                 if (seleccion == 0) {
//                     evaluarOpcion(opcion);
//                 } else {
//                     if (seleccion == 1) {
//                         // Disco SSD Kingston 240GB
//                         precioBaseAlmacenamiento += 230_000;
//                     } else if (seleccion == 2) {
//                         // Disco SSD Adata Swordfish 500GB NVME
//                         precioBaseAlmacenamiento += 295_000;
//                     } else if (seleccion == 3) {
//                         // Disco SSD Western Digital 1TB
//                         precioBaseAlmacenamiento += 515_000;
//                     } else if (seleccion == 4) {
//                         // Disco SSD Crucial 1TB
//                         precioBaseAlmacenamiento += 517_000;
//                     } else if (seleccion == 5) {
//                         // Disco SSD Swordfish 2TB M.2 NVME
//                         precioBaseAlmacenamiento += 720_000;
//                     }

//                     mostrarProcesamientoAccion();
//                 }

//             } else if (almacennamientoOpcion == 0) {
//                 mostrarMenu();
//             }
//         } else if (opcion == 7) {
//             System.out.println("Gracias por usar nuestros servicios"); // Sysout
//         }
//     }
// }