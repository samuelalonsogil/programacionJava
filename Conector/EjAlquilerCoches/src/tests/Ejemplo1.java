package tests;

import java.sql.*;

import java.util.Date;
import java.util.Scanner;

import conexion.Cliente;
import conexion.Conexion;
import conexion.Vehiculo;
import conexion.VehiculosCliente;

public class Ejemplo1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// listarClientes();
		// listarClientesVigo();
		// listarClientesParametroPreparedStatement();
		// listarClientesPreparedStatementPasandoDatos();
		// insertarClientes();
		// buscarCliente(null);
		// insertarClientes01();
		// insertarAlquilerTransaccion();
		// insertaAlquilerTransacciones01();
		// eliminarAlquiler();
		// eliminarClientes();
		// ejecutarProcedimiento();
		// ejecutarFuncion();
		// ejecutarFuncion01();
		//ejecutarProcedimientoParametrosSalida();

	}

	private static void ejecutarProcedimientoParametrosSalida() {
		Conexion conexion = new Conexion();
		// para ejecutar procedimientos
		CallableStatement cs = null;

		// el string para procedimientos tiene que ir entre llaves
		String sql = "{CALL prFechaDevolucion(?, ?)}";

		try {
			cs = conexion.getConexion().prepareCall(sql);
			/* le pasamos el parámetro */
			cs.setString(1, IntroducirDatos.listarClientesPasandoLosDatos("Matricula: "));

			/* ejecutamos, devuelve un boolean */

			/* devuelve true si hay error */
			if (cs.execute())
				System.out.println("error");
			else
				System.out.println(cs.getDate(2));

		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			conexion.desconectar();
		}

	}

	private static void ejecutarFuncion01() {
		// que ejecute una funcion que devuelva los años de antigüedad de un vehículo

		Conexion conexion = new Conexion();
		PreparedStatement ps = null;
		ResultSet rs = null;

		String sql = "SELECT veMatricula, veMarca, veModelo, vePrecio, fuAntiguedadVehiculos(veMatricula)"
				+ "FROM vehiculos" + "WHERE fuAntiguedadVehiculos(veMatricula)< ?";

		try {

			/* para selects se usa prepareStatement */
			ps = conexion.getConexion().prepareStatement(sql);
			ps.setInt(1, Integer.parseInt(IntroducirDatos.listarClientesPasandoLosDatos("N días: ")));

			rs = ps.executeQuery();

			System.out.println("Matricula \t\t Marca \t\t Modelo \t\t Precio \t\t Antigüedad");

			while (rs.next()) {
				System.out.println(rs.getString("veMatricula") + "\t\t" + rs.getString("veMarca") + "\t\t"
						+ rs.getString("veModelo") + "\t\t" + rs.getInt("vePrecio") + rs.getInt(5));

			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("error");
		} finally {
			conexion.desconectar();
		}

	}

	private static void ejecutarFuncion() {
		// que ejecute una funcion que devuelva los años de antigüedad de un vehículo

		Conexion conexion = new Conexion();
		PreparedStatement ps = null;
		ResultSet rs = null;

		String sql = "SELECT veMatricula, veMarca, veModelo, vePrecio, fuAntiguedadVehiculos(veMatricula)"
				+ "FROM vehiculos";

		try {
			ps = conexion.getConexion().prepareStatement(sql);
			rs = ps.executeQuery();
			System.out.println("Matricula \t\t Marca \t\t Modelo \t\t Precio \t\t Antigüedad");
			while (rs.next()) {
				System.out.println(rs.getString("veMatricula") + "\t\t" + rs.getString("veMarca") + "\t\t"
						+ rs.getString("veModelo") + "\t\t" + rs.getInt("vePrecio") + rs.getInt(5));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conexion.desconectar();
		}

	}

	private static void ejecutarProcedimiento() {
		// ejecutar un procedimiento que incremente el precio del alquiler de los coches
		// de una marca en una cantidad introducida

		Conexion conexion = new Conexion();

		// para ejecutar procedimientos
		CallableStatement cs = null;

		// el string para procedimientos tiene que ir entre llaves
		String sql = "{CALL prIncrementarPrecio(?, ?)}";

		try {
			cs = conexion.getConexion().prepareCall(sql);
			String grupo = IntroducirDatos.listarClientesPasandoLosDatos("Grupo del vehículo: ");
			int incremento = Integer.parseInt(IntroducirDatos.listarClientesPasandoLosDatos("Incremento: "));

			cs.setString(1, grupo);
			cs.setInt(2, incremento);

			// ejecutar el procedimiento
			if (cs.execute())
				System.out.println("Actualización OK");
			else
				System.out.println("Error al actualizar");

		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			conexion.desconectar();
		}

	}

	private static VehiculosCliente buscarVehiculoCliente(String dni) {
		// buscar un alquiler

		Conexion conexion = new Conexion();

		PreparedStatement ps = null;
		ResultSet rs = null;

		VehiculosCliente vc = null;

		String sql = "SELECT * FROM VehiculosClienteS WHERE vcDni=?";

		try {
			ps = conexion.getConexion().prepareStatement(sql);
			ps.setString(1, dni);

			rs = ps.executeQuery();

			if (rs.next()) {
				vc = new VehiculosCliente();
				vc.setDni(rs.getString("vcDni"));
				vc.setMatricula(rs.getString("vcMatricula"));
				vc.setFecInicio(rs.getDate("vcFecInicio"));
				vc.setNumDias(rs.getInt("vcDias"));
				vc.setSeguro(rs.getString("vcSeguro"));
			}

		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			conexion.desconectar();
		}

		return null;
	}

	private static void eliminarAlquileresCliente(String dni) {
		// eliminar alquileres de un cliente

		Conexion conexion = new Conexion();
		PreparedStatement ps = null;

		int filas = 0;

		String sql = "DELETE FROM VehiculosClientes WHERE vcDni = ?";

		try {
			ps = conexion.getConexion().prepareStatement(sql);
			ps.setString(1, dni);

			filas = ps.executeUpdate();

		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			conexion.desconectar();
		}

	}

	private static void eliminarClientes() {
		// eliminar registros de una tabla referenciada

		Conexion conexion = new Conexion();
		PreparedStatement ps = null;

		int filas = 0;

		String dni = IntroducirDatos.listarClientesPasandoLosDatos("Dni Cliente: ");

		VehiculosCliente vehiculoCliente = buscarVehiculoCliente(dni);

		if (vehiculoCliente == null) {

			String sql = "DELETE FROM Clientes WHERE clDni = ?";

			try {
				ps = conexion.getConexion().prepareStatement(sql);
				ps.setString(1, IntroducirDatos.listarClientesPasandoLosDatos("DNI Cliente: "));

				filas = ps.executeUpdate();

				if (filas == 0)
					System.out.println("error al eliminar");
				else
					System.out.println("eliminación OK");

			} catch (SQLException se) {
				se.printStackTrace();
			}
		} else {
			// System.out.println("El cliente no se puede eliminar, tiene registros");
			eliminarAlquileresCliente(dni);
		}
	}

	private static void eliminarAlquiler() {
		// eliminar un alquiler por el campo clave

		Conexion conexion = new Conexion();
		PreparedStatement ps = null;

		int filas = 0;

		String sql = "DELETE FROM VehiculosClientes WHERE vcId = ?";

		try {
			ps = conexion.getConexion().prepareStatement(sql);
			ps.setInt(1, Integer.parseInt(IntroducirDatos.listarClientesPasandoLosDatos("Nº alquiler: ")));

			filas = ps.executeUpdate();

			if (filas == 0)
				System.out.println("error al eliminar");
			else
				System.out.println("eliminación OK");
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			conexion.desconectar();
		}
	}

	private static void insertaAlquilerTransacciones01() {

		/*
		 * Insertar un alquiler de un coche creando una transacción sin comprobar los
		 * datos
		 */

		Conexion conexion = new Conexion();
		PreparedStatement ps = null;

		String sql = "INSERT INTO VehiculosClientes(vcMatricula, vcDni, vcFecInicio, vcDias, vcSeguro)"
				+ "VALUES (?, ?, ?, ?, ?)";

		String sql1 = "UPDATE Vehiculos SET  veDisponible = false WHERE veMatricula = ?;";
		String matricula = "";
		int filas = 0;

		try {

			// iniciar la transaccion
			conexion.getConexion().setAutoCommit(false);

			ps = conexion.getConexion().prepareStatement(sql);

			matricula = IntroducirDatos.listarClientesPasandoLosDatos(matricula);
			ps.setString(1, matricula);

			String dni = IntroducirDatos.listarClientesPasandoLosDatos("DNI: ");

			ps.setString(2, dni);

			Date fecha = ConvertirFechas
					.convertirStringDate(IntroducirDatos.listarClientesPasandoLosDatos("Fecha inicio: "));

			ps.setDate(3, ConvertirFechas.convertirJavaDateASqlDate(fecha));

			int dias = Integer.parseInt(IntroducirDatos.listarClientesPasandoLosDatos("N días: "));
			ps.setInt(4, dias);

			String seguro = IntroducirDatos.listarClientesPasandoLosDatos("Seguro: ");
			ps.setString(5, seguro);

			/* ha ejecutado el insert */
			filas = ps.executeUpdate();

			/* preparamos la ejecución del update */
			ps = conexion.getConexion().prepareStatement(sql1);
			ps.setString(1, matricula);

			filas = 0;
			filas = ps.executeUpdate();

			/* confirmar transaccion */
			conexion.getConexion().commit();

			if (filas == 0)
				System.out.println("error al insertar");
			else
				System.out.println("insercion correcta");
		} catch (SQLException se) {
			se.printStackTrace();
			try {
				conexion.getConexion().rollback();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private static void insertarAlquilerTransaccion() {
		Conexion conexion = new Conexion();
		PreparedStatement ps = null;

		String sql = "INSERT INTO AlquilerVehiculos(vcMatricula, vdDNI, vcFecInicio, vcDias, vcSeguro)"
				+ "VALUES (?, ?, ?, ?, ?)";

		String sql1 = "Update Vehiculos SET veDisponible = false WHERE veMatricula = ?";

		String matricula = IntroducirDatos.listarClientesPasandoLosDatos("Matricula: ");
		if (buscarVehiculoDisponible(matricula) == null) {
			System.out.println("Vehiculo inexistente");
		} else {
			String dni = IntroducirDatos.listarClientesPasandoLosDatos("DNI Cliente: ");
			if (buscarCliente(dni) == null) {
				System.out.println("Cliente inexistente");
			} else {
				String fecha = IntroducirDatos.listarClientesPasandoLosDatos("Fecha inicio: ");
				Date fecInicio = ConvertirFechas.convertirStringDate(fecha);
				int dias = Integer.parseInt(IntroducirDatos.listarClientesPasandoLosDatos("Nº Días: "));
				String seguro = IntroducirDatos.listarClientesPasandoLosDatos("Seguro: ");

				try {
					// iniciar la transaccion
					conexion.getConexion().setAutoCommit(false);

					ps = conexion.getConexion().prepareStatement(sql);
					ps.setString(1, matricula);
					ps.setString(2, dni);
					ps.setDate(3, ConvertirFechas.convertirJavaDateASqlDate(fecInicio));
					ps.setInt(4, dias);
					ps.setString(5, seguro);
					ps.executeUpdate();

					ps = conexion.getConexion().prepareStatement(sql1);
					ps.setString(1, matricula);

					int filas = ps.executeUpdate();

					if (filas == 0) {
						System.out.println("error al insertar");
					} else {
						System.out.println("insercion OK");
					}

					conexion.getConexion().commit();

				} catch (SQLException se) {
					try {
						conexion.getConexion().rollback();
					} catch (SQLException e) {

						e.printStackTrace();
					}
					se.printStackTrace();

				} finally {
					conexion.desconectar();
				}
			}
		}
	}

	private static Object buscarVehiculoDisponible(String matricula) {
		// comprobar si el vehiculo existe y está disponible
		Conexion conexion = new Conexion();
		PreparedStatement ps = null;
		ResultSet rs = null;

		String sql = "SELECT * FROM Vehiculos WHERE veMAtricula = ? AND veDispnible = true";
		Vehiculo vehiculo = null;

		try {
			ps = conexion.getConexion().prepareStatement(sql);
			ps.setString(1, matricula);

			rs = ps.executeQuery();

			if (rs.next()) {
				vehiculo = new Vehiculo();
				vehiculo.setMatricula(matricula);
				vehiculo.setMarca("veMArca");
				vehiculo.setModelo(rs.getString("veModelo"));
				vehiculo.setGrupo(rs.getString("veGrupo"));
				vehiculo.setCapacidad(rs.getInt("veCapacidad"));
				vehiculo.setDisponible(rs.getInt("veDisponible"));
				vehiculo.setEdadMinima(rs.getInt("veEdadMinima"));
				vehiculo.setFecCompra(rs.getDate("veFecCompra"));
				vehiculo.setPlazas(rs.getInt("vePlazas"));
				vehiculo.setPrecio(rs.getInt("vePrecio"));
				vehiculo.setPuertas(rs.getInt("vePuertas"));
			}
		} catch (SQLException se) {
			se.printStackTrace();

		} finally {
			conexion.desconectar();
		}
		return vehiculo;

	}

	private static void insertarClientes01() {
		Conexion conexion = new Conexion();
		PreparedStatement ps = null;
		String dni = IntroducirDatos.listarClientesPasandoLosDatos("DNI Cliente:");

		String sql = "SELECT * FROM Clientes WHERE clDNI = ?";

		Cliente cliente = buscarCliente(dni);
		if (cliente != null)
			System.out.println("Cliente existente");
		else {

			try {
				ps = conexion.getConexion().prepareStatement(sql);
				ps.setString(1, dni);
				ps.setString(2, IntroducirDatos.listarClientesPasandoLosDatos("Nombre: "));
				ps.setString(3, IntroducirDatos.listarClientesPasandoLosDatos("Dirección: "));
				ps.setString(4, IntroducirDatos.listarClientesPasandoLosDatos("Ciudad: "));
				ps.setInt(5, Integer.parseInt(IntroducirDatos.listarClientesPasandoLosDatos("CP: ")));
				ps.setString(6, IntroducirDatos.listarClientesPasandoLosDatos("Provincia: "));
				ps.setInt(7, Integer.parseInt(IntroducirDatos.listarClientesPasandoLosDatos("Telefono: ")));
				ps.setString(8, IntroducirDatos.listarClientesPasandoLosDatos("Número tarjeta: "));

				int filas = ps.executeUpdate();
				if (filas == 0)
					System.out.println("Error al insertar");
				else
					System.out.println("Inserción OK");
			} catch (SQLException e) {

			}
		}

	}

	private static Cliente buscarCliente(String dni) {
		Conexion conexion = new Conexion();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM Clientes WHERE clDNI = ?";
		Cliente cliente = null;

		try {
			ps = conexion.getConexion().prepareStatement(sql);
			ps.setString(1, dni);
			rs = ps.executeQuery();

			if (rs.next()) {
				cliente = new Cliente();
				cliente.setDni(rs.getString("clDni"));
				cliente.setNombre(rs.getString("clNombre"));
				cliente.setDireccion(rs.getString("clDireccion"));
				cliente.setCiudad(rs.getString("clCiudad"));
				cliente.setCodPostal(rs.getInt("clCodigoPostal"));
				cliente.setProvincia(rs.getString("clProvincia"));
				cliente.setTelefono(rs.getInt("clTelefono"));
				cliente.setNumTarjeta(rs.getString("clNumTarjeta"));
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			conexion.desconectar();
		}
		System.out.println(cliente);
		return cliente;
	}

	private static void insertarClientes() {
		Conexion conexion = new Conexion();

		PreparedStatement ps = null;
		// no necesitas el resoultset al ser un insert

		String sql = "INSERT INTO Clientes (clDni, clNombre, clDireccion, clCiudad, clCodigoPostal, clProvincia, "
				+ " clTelefono, clNumTarjeta)" + " VALUES (?,?,?,?,?,?,?,?)";

		try {

			ps = conexion.getConexion().prepareStatement(sql);
			ps.setString(1, IntroducirDatos.listarClientesPasandoLosDatos("Dni: ")); /* el índice empieza en 1 */
			ps.setString(2, IntroducirDatos.listarClientesPasandoLosDatos("Nombre: "));
			ps.setString(3, IntroducirDatos.listarClientesPasandoLosDatos("Dirección: "));
			ps.setString(4, IntroducirDatos.listarClientesPasandoLosDatos("Ciudad: "));
			ps.setInt(5, Integer.parseInt(IntroducirDatos.listarClientesPasandoLosDatos("CP: ")));
			ps.setString(6, IntroducirDatos.listarClientesPasandoLosDatos("Provincia: "));
			ps.setInt(7, Integer.parseInt(IntroducirDatos.listarClientesPasandoLosDatos("Telefono: ")));
			ps.setString(8, IntroducirDatos.listarClientesPasandoLosDatos("Número tarjeta: "));

			int filas = ps.executeUpdate();
			if (filas != 0)
				System.out.println("Inserción correcta");
			else
				System.out.println("La inserción no se ha realizado");

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	private static void listarClientesPreparedStatementPasandoDatos() {

		Conexion conexion = new Conexion();

		// preparar la consulta
		PreparedStatement ps = null;
		ResultSet rs = null;

		String ciudad = IntroducirDatos.listarClientesPasandoLosDatos("Ciudad: ");
		String sql = "SELECT veMatricula, veMarca, clNombre, clTelefono, vcFecInicio, " + "vcDias, vcPrecio, vePrecio"
				+ "FROM Vehiculos JOIN vehiculosClientes on veMatricula = vcMatricula "
				+ "WHERE veMarca = ? AND vcDias > ?";
		try {
			/* le tienes que pasar el valor del where */
			ps = conexion.getConexion().prepareStatement(sql);
			ps.setString(1, IntroducirDatos.listarClientesPasandoLosDatos("Marca: ")); /* el índice empieza en 1 */
			ps.setInt(2, Integer.parseInt(IntroducirDatos.listarClientesPasandoLosDatos("Nº Días: ")));

			rs = ps.executeQuery();

			while (rs.next()) {
				String mat = rs.getString("veMatricula");
				String mar = rs.getString("veMarca");
				String cli = rs.getString("clNombre");
				int tlf = rs.getInt("clTelefono");
				Date fec = rs.getDate("vcFecInicio");
				int dias = rs.getInt("vcDias");
				int pre = rs.getInt(8);

				System.out.println(mat + "\t" + mar + "\t" + cli + "\t" + tlf + "\t" + fec + "\t" + dias + "\t" + pre);

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		conexion.desconectar();
	}

	private static void listarClientesParametroPreparedStatement() {

		Conexion conexion = new Conexion();

		// preparar la consulta
		PreparedStatement ps = null;
		ResultSet rs = null;

		String ciudad = IntroducirDatos.listarClientesPasandoLosDatos("Ciudad: ");
		String sql = "SELECT * FROM Clientes WHERE clCiudad = ?";
		try {
			/* le tienes que pasar el valor */
			ps = conexion.getConexion().prepareStatement(sql);
			ps.setString(1, ciudad); /* el índice empieza en 1 */

			rs = ps.executeQuery();

			while (rs.next()) { /* se pueden pasar e imprimir así también */
				System.out.println(rs.getString("clDni") + "\t" + rs.getString("clNombre") + "\t"
						+ rs.getString("clDireccion") + "\t");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		conexion.desconectar();
	}

	private static void listarClientesVigo() {
		Conexion conexion = new Conexion();

		// preparar la consulta
		Statement st = null;
		ResultSet rs = null;

		String ciudad = "Vigo";

		/* puedes declarar una variable con el nombre o poner el nombre directo */
		String sql = "SELECT * FROM Clientes WHERE clCiudad = '" + ciudad + "'";
		try {
			st = conexion.getConexion().createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				String dni = rs.getString("clDNI"); // se puede poner tanto el nombre como el num de la columna
				String nb = rs.getString("clNombre");
				String dir = rs.getString("clDireccion");
				String ciu = rs.getString("clCiudad");
				int cp = rs.getInt("clCodigoPostal");
				String pro = rs.getString("clProvincia");
				int tel = rs.getInt("clTelefono");
				String numt = rs.getString("clNumTarjeta");

				System.out.println(
						dni + "\t" + nb + "\t" + dir + "\t" + ciu + "\t" + cp + "\t" + pro + "\t" + tel + "\t" + numt);

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		conexion.desconectar();
	}

	private static void listarClientes() {
		Conexion conexion = new Conexion();
		Statement st = null;
		ResultSet rs = null;

		String sql = "SELECT clDNI, clNombre, clDireccion, clTelefono, clNumTarjeta " + "FROM Clientes";

		try {
			st = conexion.getConexion().createStatement();
			rs = st.executeQuery(sql);

			while (rs.next()) {
				String dni = rs.getString(1);
				String dni1 = rs.getString("clDNI");
				String nb = rs.getString("clNombre");
				String dir = rs.getString("clDireccion");
				int tle = rs.getInt("clTelefono");
				String numTar = rs.getString("clNumTarjeta");

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
