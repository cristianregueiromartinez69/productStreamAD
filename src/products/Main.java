
package products;

import java.io.*;

import javax.swing.JOptionPane;

/**
 * clase main donde ejecutamos el programa
 * @author cristian
 * @version 1.0
 */
public class Main {

	public static void main(String[] args) {

		//creamos los 4 objetos
		Product producto1 = new Product("cod1", "parafusos", 3.0);
		Product producto2 = new Product("cod2", "cravos", 4.0);
		Product producto3 = new Product("cod3", "tachas", 6.0);
		Product producto4 = new Product("cod4", "grapas", 2.0);

		try {
			String ruta = JOptionPane.showInputDialog("Introduce la ruta para crear el fichero: ");

			//comprobamos si existe para ver si lo creamos o no
			File myfile = new File(ruta);
			if(!myfile.exists()) {
				if(myfile.createNewFile()) {
					DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(myfile)));
					dos.writeUTF(producto1.getCodigo() + " , " + producto1.getDescripcion() + ", ");
					dos.writeDouble(producto1.getPrecio());

					dos.writeUTF(producto2.getCodigo() + " , " + producto2.getDescripcion() + ", ");
					dos.writeDouble(producto2.getPrecio());

					dos.writeUTF(producto3.getCodigo() + " , " + producto3.getDescripcion() + ", ");
					dos.writeDouble(producto3.getPrecio());

					dos.writeUTF(producto4.getCodigo() + " , " + producto4.getDescripcion() + ", ");
					dos.writeDouble(producto4.getPrecio());

					dos.close();
				}
				else {
				System.out.println("No se pudo crear el archivo");
				}
			}else {
				DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(myfile)));
				dos.writeUTF(producto1.getCodigo() + " , " + producto1.getDescripcion() + ", ");
				dos.writeDouble(producto1.getPrecio());

				dos.writeUTF(producto2.getCodigo() + " , " + producto2.getDescripcion() + ", ");
				dos.writeDouble(producto2.getPrecio());

				dos.writeUTF(producto3.getCodigo() + " , " + producto3.getDescripcion() + ", ");
				dos.writeDouble(producto3.getPrecio());

				dos.writeUTF(producto4.getCodigo() + " , " + producto4.getDescripcion() + ", ");
				dos.writeDouble(producto4.getPrecio());

				dos.close();
			}



		} catch (IOException e) {
			System.out.println("No se ha podido escribir en el fichero");

		}

		try {

			Product po3 = new Product();
			String ruta = JOptionPane.showInputDialog("Introduce la ruta para crear el fichero: ");
			File myFile = new File(ruta);
			DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(myFile)));

			//comprobamos si existe para leerlo, en caso de no existir, recogemos la excepcion
			if (myFile.exists()) {
				System.out.println("Lista de los productos guardados en el fichero produtos.txt");
				while (dis.available() > 0) {

					String infoProducto = dis.readUTF();
					double precio = dis.readDouble();
					po3.setCodigo(infoProducto);
					po3.setPrecio(precio);
					System.out.println(infoProducto + " , " + precio);
				}
			} else {
				System.out.println("Archivo inexistente");
			}

		} catch (IOException e) {
			System.out.println("No se pudo leer el archivo");
		}
	}

}