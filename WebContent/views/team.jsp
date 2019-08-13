<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Cenfo HR</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Font Awesome -->
    <link rel="stylesheet" href="../framework/plugins/fontawesome-free/css/all.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
    <!-- DataTables -->
    <link rel="stylesheet" href="../framework/plugins/datatables/dataTables.bootstrap4.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="../framework/dist/css/adminlte.min.css">
    <!-- Google Font: Source Sans Pro -->
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
</head>

<body class="hold-transition sidebar-mini sidebar-collapse">

    <nav class="main-header navbar navbar-expand navbar-white navbar-light">
        <!-- Left navbar links -->
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" data-widget="pushmenu" href="#"><i class="fas fa-bars"></i></a>
            </li>
            <li class="nav-item d-none d-sm-inline-block">
                <a href="dashboard.html" class="nav-link">Home</a>
            </li>
        </ul>

        <!-- Right navbar links -->
        <ul class="navbar-nav ml-auto">
            <!-- Notifications Dropdown Menu -->
            <li class="nav-item dropdown">
                <a class="nav-link" data-toggle="dropdown" href="#">
                    <i class="far fa-bell"></i>
                    <span class="badge badge-warning navbar-badge">15</span>
                </a>
                <div class="dropdown-menu dropdown-menu-lg dropdown-menu-right">
                    <span class="dropdown-item dropdown-header">15 Notifications</span>
                    <div class="dropdown-divider"></div>
                    <a href="notifications.html" class="dropdown-item">
                        <i class="fas fa-envelope mr-2"></i> 1 new message
                        <span class="float-right text-muted text-sm">3 mins</span>
                    </a>
                    <div class="dropdown-divider"></div>
                    <a href="notifications.html" class="dropdown-item">
                        <i class="fas fa-envelope mr-2"></i> 1 new message
                        <span class="float-right text-muted text-sm">12 hours</span>
                    </a>
                    <div class="dropdown-divider"></div>
                    <a href="notifications.html" class="dropdown-item">
                        <i class="fas fa-envelope mr-2"></i> 1 new message
                        <span class="float-right text-muted text-sm">2 days</span>
                    </a>
                    <div class="dropdown-divider"></div>
                    <a href="notifications.html" class="dropdown-item dropdown-footer">See All Notifications</a>
                </div>
            </li>
            <li class="nav-item">
                <a class="nav-link" data-widget="control-sidebar" data-slide="true" href="#">
                    <i class="fas fa-th-large"></i>
                </a>
            </li>
        </ul>
    </nav>
    <!-- /.navbar -->

    <!-- Main Sidebar Container -->
    <aside class="main-sidebar sidebar-dark-primary elevation-4">
        <!-- Brand Logo -->
        <a href="dashboard.html" class="brand-link">
            <img src="../framework/dist/img/AdminLTELogo.png" alt="AdminLTE Logo"
                class="brand-image img-circle elevation-3" style="opacity: .8">
            <span class="brand-text font-weight-light">Cenfo HR</span>
        </a>

        <!-- Sidebar -->
        <div class="sidebar">
            <!-- Sidebar user (optional) -->
            <div class="user-panel mt-3 pb-3 mb-3 d-flex">
                <div class="image">
                    <img src="../framework/dist/img/user2-160x160.jpg" class="img-circle elevation-2" alt="User Image">
                </div>
                <div class="info">
                    <a href="profile.html" class="d-block">User</a>
                </div>
            </div>

            <!-- Sidebar Menu -->
            <nav class="mt-2">
                <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu"
                    data-accordion="false">
                    <!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
                    <li class="nav-item has-treeview">
                        <a href="dashboard.html" class="nav-link">
                            <i class="nav-icon fas fa-tachometer-alt"></i>
                            <p>
                                Dashboard
                            </p>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a href="timeSheet.html" class="nav-link">
                            <i class="nav-icon fas fa-user-clock"></i>
                            <p>
                                Time Sheet
                            </p>
                        </a>
                    </li>
                    <li class="nav-item has-treeview">
                        <a href="accounting.html" class="nav-link">
                            <i class="nav-icon fas fa-hand-holding-usd"></i>
                            <p>
                                Accounting
                            </p>
                        </a>
                    </li>
                    <li class="nav-item has-treeview">
                        <a href="permissions.html" class="nav-link">
                            <i class="nav-icon fas fa-suitcase-rolling"></i>
                            <p>
                                Permissions
                            </p>
                        </a>
                    </li>
                    <li class="nav-item has-treeview">
                        <a href="employees.html" class="nav-link">
                            <i class="nav-icon fas fa-users"></i>
                            <p>
                                Employees
                            </p>
                        </a>
                    </li>
                    <li class="nav-item has-treeview">
                        <a href="proyect.jsp" class="nav-link">
                            <i class="nav-icon fas fa-users"></i>
                            <p>
                                Projectos
                            </p>
                        </a>
                    </li>
                    <li class="nav-item has-treeview">
                        <a href="team.jsp" class="nav-link">
                            <i class="nav-icon fas fa-users"></i>
                            <p>
                                Equipos
                            </p>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a href="#" class="nav-link">
                            <i class="nav-icon fas fa-sign-out-alt"></i>
                            <p>
                                Sign off
                            </p>
                        </a>
                    </li>
                </ul>
            </nav>
            <!-- /.sidebar-menu -->
        </div>
        <!-- /.sidebar -->
    </aside>

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <div class="container-fluid">
                <div class="row mb-2">
                    <div class="col-sm-6">
                        <h1>Equipo</h1>
                    </div>
                    <div class="col-sm-6">
                        <ol class="breadcrumb float-sm-right">
                            <li class="breadcrumb-item"><a href="dashboard.html">Home</a></li>
                            <li class="breadcrumb-item active">Equipo</li>
                        </ol>
                    </div>
                </div>
            </div><!-- /.container-fluid -->
        </section>

        <section class="content">
            <div class="row">
                <div class="col-md-12">
                    <div class="card card-info">
                        <div class="card-header">
                            <h3 class="card-title">Agregar un nuevo equipo</h3>
                        </div>
                        <form action="../ControllerTeam" class="form-horizontal" method="post">
                            <div class="row">
                                <div class="col-12">
                                    <div class="card-body">
                                        <div class="form-group row">
                                            <label for="nombreEquipo" class="col-sm-2 control-label">Nombre del equipo
                                                </label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control" name="nombreEquipo"
                                                    id="nombreEquipo" placeholder="Nombre del Equipo">
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label for="descripcion" class="col-sm-2 control-label">Descripcion</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control" name="descripcion"
                                                    id="descripcion" placeholder="descripcion">
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="card-footer">
                                    <button type="submit" class="btn btn-info">Agregar</button>
                                </div>
                                <select name="team">
                                    <c:forEach items="${listTeam}" var="team">
                                        <option value="${team.id}">
                                            ${team.name}
                                        </option>
                                    </c:forEach>
                                </select>
                            </div>
                        </form>

                    </div>
                </div>
            </div>
        </section>
  <!-- Main content -->
  <section class="content">

      <!-- Default box -->
      <div class="card">
          <div class="card-header">
              <h3 class="card-title">Title</h3>

              <div class="card-tools">
                  <button type="button" class="btn btn-tool" data-widget="collapse" data-toggle="tooltip"
                      title="Collapse">
                      <i class="fas fa-minus"></i></button>
                  <button type="button" class="btn btn-tool" data-widget="remove" data-toggle="tooltip" title="Remove">
                      <i class="fas fa-times"></i></button>
              </div>
          </div>
          <div class="card-body">
              Start creating your amazing application!
          </div>
          <!-- /.card-body -->
          <div class="card-footer">
              Footer
          </div>
          <!-- /.card-footer-->
      </div>
      <!-- /.card -->

  </section>
  <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->

  <footer class="main-footer">
      <div class="float-right d-none d-sm-block">
          <b>Version</b> 1.0
      </div>
      <strong>Copyright &copy; 2019 All rights
          reserved.
  </footer>

  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
      <!-- Control sidebar content goes here -->
  </aside>
  <!-- /.control-sidebar -->
  </div>
  <!-- ./wrapper -->

  <!-- jQuery -->
  <script src="../framework/plugins/jquery/jquery.min.js"></script>
  <!-- Bootstrap 4 -->
  <script src="../framework/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
  <!-- FastClick -->
  <script src="../framework/plugins/fastclick/fastclick.js"></script>
  <!-- AdminLTE App -->
  <script src="../framework/dist/js/adminlte.min.js"></script>
  <!-- AdminLTE for demo purposes -->
  <script src="../framework/dist/js/demo.js"></script>
  </body>

  </html>