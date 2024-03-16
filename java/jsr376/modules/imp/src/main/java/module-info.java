module com.nc.edu.modules.imp {

	requires transitive com.nc.edu.modules.api;

	provides com.nc.edu.modules.api.pub.UserService with com.nc.edu.modules.imp.pub.UserServiceImp;

}