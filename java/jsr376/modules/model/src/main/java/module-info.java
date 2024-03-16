module com.nc.edu.modules.model {

	requires transitive com.nc.edu.modules.lib;

	exports com.nc.edu.modules.model.pub;
	exports com.nc.edu.modules.model.internal;

	opens com.nc.edu.modules.model.pub;
	opens com.nc.edu.modules.model.internal to com.nc.edu.modules.model.lib;

}