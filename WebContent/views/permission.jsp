<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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
   <!-- fullCalendar -->
   <link rel="stylesheet" href="../framework/plugins/fullcalendar/main.min.css">
   <link rel="stylesheet" href="../framework/plugins/fullcalendar-interaction/main.min.css">
   <link rel="stylesheet" href="../framework/plugins/fullcalendar-daygrid/main.min.css">
   <link rel="stylesheet" href="../framework/plugins/fullcalendar-timegrid/main.min.css">
   <link rel="stylesheet" href="../framework/plugins/fullcalendar-bootstrap/main.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="../framework/dist/css/adminlte.min.css">
  <!-- Google Font: Source Sans Pro -->
  <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
</head>
<body class="hold-transition sidebar-mini sidebar-collapse">
<!-- Site wrapper -->
<div class="wrapper">
  <!-- Navbar -->
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
      <img src="../framework/dist/img/AdminLTELogo.png"
           alt="AdminLTE Logo"
           class="brand-image img-circle elevation-3"
           style="opacity: .8">
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
        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
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
            <h1>Calendar</h1>
          </div>
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="#">Home</a></li>
              <li class="breadcrumb-item active">Calendar</li>
            </ol>
          </div>
        </div>
      </div><!-- /.container-fluid -->
    </section>

    <!-- Main content -->
    <section class="content">


      <div class="container-fluid">
        <div class="row">
            <div class="col-lg-6 col-6">
                <!-- small card -->
                <div class="small-box bg-success">
                  <div class="inner">
                    <h3>00</h3>
        
                    <p>Permissions Available</p>
                  </div>
                  <div class="icon">
                    <i class="fas fa-suitcase"></i>
                  </div>
                  <a href="#" class="small-box-footer">
                    More info <i class="fas fa-arrow-circle-right"></i>
                  </a>
                </div>
              </div>
        
              <div class="col-lg-6 col-6">
                <!-- small card -->
                <div class="small-box bg-info">
                  <div class="inner">
                    <h3>00</h3>
        
                    <p>Permissions Annual</p>
                  </div>
                  <div class="icon">
                    <i class="fas fa-suitcase-rolling"></i>
                  </div>
                  <a href="#" class="small-box-footer">
                    More info <i class="fas fa-arrow-circle-right"></i>
                  </a>
                </div>
              </div>
          <div class="col-md-4">
            <div class="sticky-top mb-3">
              <div class="card card-outline card-primary">
                <div class="card-header">
                  <h4 class="card-title">New permission</h4>
                </div>
                <div class="card-body">
                  <!-- the events -->
                  <div id="external-events" style="display: none">

                  </div>

                  <form action="../ControllerPermission" method="post" class="form-horizontal">
                    <div class="form-group row">
                      <label for="inputName2" class="col-md-2 control-label">Date</label>
                      <div class="col-md-10">
                        <div class="input-group">
                            <div class="input-group-prepend">
                              <span class="input-group-text"><i class="far fa-calendar-alt"></i></span>
                            </div>
                            <input type="date" class="form-control" name="startDate" required pattern="[0-9]{2}-[0-9]{2}-[0-9]{4}">
                          </div>
                      </div>
                    </div>
                    <div class="form-group row">
                        <label for="inputName2" class="col-md-2 control-label">Type</label>
                        <div class="col-md-10">
                            <select class="form-control" name="type">
                                <option value="VACATION">VACATION</option>
                                <option value="INCAPACITY">INCAPACITY</option>
                                <option value="MIDDAY">MIDDAY</option>
                                <option value="WITHSALARY">WITHSALARY</option>
                                <option value="WITHOUTSALARY">WITHOUTSALARY</option>
                              </select>
                          </div>
                      </div>
                      <div class="form-group row">
                        <label for="inputName2" class="col-md-2 control-label">Comment</label>
                        <div class="col-md-10">
                           <textarea class="form-control" rows="5" name="comment"></textarea>
                          </div>
                      </div>
                      <div class="form-group row">
                          <label for="inputName2" class="col-md-2 control-label">Days</label>
                          <div class="col-md-10">
                              <input type="number" class="form-control" id="inputName" placeholder="Days" min="1" name="days">
                            </div>
                        </div>
                        <div class="form-group row">
                          <label for="inputName2" class="col-md-2 control-label">Document</label>
                          <div class="col-md-10">
                              <div class="custom-file">
                                      <input type="file" class="custom-file-input" name="doc" id="exampleInputFile">
                                      <label class="custom-file-label" for="exampleInputFile">Choose file</label>
                                    </div>
                            </div>
                        </div>
                        <button type="submit" class="btn btn-primary btn-block">Request</button>
                  </form>
                </div>
                <!-- /.card-body -->
              </div>
            </div>
          </div>
          <!-- /.col -->
          <div class="col-md-8">
            <div class="card card-primary">
              <div class="card-body p-0">
                <!-- THE CALENDAR -->
                <div id="calendar"></div>
              </div>
              <!-- /.card-body -->
            </div>
            <!-- /.card -->
          </div>
          <!-- /.col -->
        </div>

        <!-- Admin table -->
        <div class="row">
            <div class="col-12">
                <hr>
                <h2>Permissions</h2>
                <div class="card">
                  <div class="card-body">
                    <table id="example1" class="table table-bordered table-striped">
                      <thead>
                      <tr>
                        <th>ID</th>
                        <th>Type</th>
                        <th>Start Date</th>
                        <th>Days</th>
                        <th>Status</th>
                        <th>Is Payment</th>
                        <th>Comment</th>
                        <th>Document</th>
                      </tr>
                      </thead>
                      <tbody>
                      <tr>
                        <td>-1</td>
                        <td>TEST</td>
                        <td>2019-08-23</td>
                        <td>1</td>
                        <td>PENDING</td>
                        <td>TRUE</td>
                        <td>Lorem Impsun</td>
                        <td>doc.docx</td>
                      </tr>
                      </tbody>
                    </table>
                  </div>
                </div>
              </div>
        </div>
        <!-- /.row -->
      </div><!-- /.container-fluid -->
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
<!-- jQuery -->
<script src="../framework/plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap -->
<script src="../framework/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- jQuery UI -->
<script src="../framework/plugins/jquery-ui/jquery-ui.min.js"></script>
<!-- FastClick -->
<script src="../framework/plugins/fastclick/fastclick.js"></script>
<!-- DataTables -->
<script src="../framework/plugins/datatables/jquery.dataTables.js"></script>
<script src="../framework/plugins/datatables/dataTables.bootstrap4.js"></script>
<!-- AdminLTE App -->
<script src="../framework/dist/js/adminlte.min.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="../framework/dist/js/demo.js"></script>
<!-- fullCalendar 2.2.5 -->
<script src="../framework/plugins/moment/moment.min.js"></script>
<script src="../framework/plugins/fullcalendar/main.min.js"></script>
<script src="../framework/plugins/fullcalendar-daygrid/main.min.js"></script>
<script src="../framework/plugins/fullcalendar-timegrid/main.min.js"></script>
<script src="../framework/plugins/fullcalendar-interaction/main.min.js"></script>
<script src="../framework/plugins/fullcalendar-bootstrap/main.min.js"></script>
<!-- page script -->
<script>
    $(function () {
      $("#example1").DataTable();
      $('#example2').DataTable({
        "paging": true,
        "lengthChange": false,
        "searching": false,
        "ordering": true,
        "info": true,
        "autoWidth": false,
      });
    });
  </script>
<!-- Page specific script -->
<script>
  $(function () {

    /* initialize the external events
     -----------------------------------------------------------------*/
    function ini_events(ele) {
      ele.each(function () {

        // create an Event Object (http://arshaw.com/fullcalendar/docs/event_data/Event_Object/)
        // it doesn't need to have a start or end
        var eventObject = {
          title: $.trim($(this).text()) // use the element's text as the event title
        }

        // store the Event Object in the DOM element so we can get to it later
        $(this).data('eventObject', eventObject)

        // make the event draggable using jQuery UI
        $(this).draggable({
          zIndex        : 1070,
          revert        : true, // will cause the event to go back to its
          revertDuration: 0  //  original position after the drag
        })

      })
    }

    ini_events($('#external-events div.external-event'))

    /* initialize the calendar
     -----------------------------------------------------------------*/
    //Date for the calendar events (dummy data)
    var date = new Date()
    var d    = date.getDate(),
        m    = date.getMonth(),
        y    = date.getFullYear()

    var Calendar = FullCalendar.Calendar;
    var Draggable = FullCalendarInteraction.Draggable;

    var containerEl = document.getElementById('external-events');
    var checkbox = document.getElementById('drop-remove');
    var calendarEl = document.getElementById('calendar');

    // initialize the external events
    // -----------------------------------------------------------------

    new Draggable(containerEl, {
      itemSelector: '.external-event',
      eventData: function(eventEl) {
        console.log(eventEl);
        return {
          title: eventEl.innerText,
          backgroundColor: window.getComputedStyle( eventEl ,null).getPropertyValue('background-color'),
          borderColor: window.getComputedStyle( eventEl ,null).getPropertyValue('background-color'),
          textColor: window.getComputedStyle( eventEl ,null).getPropertyValue('color'),
        };
      }
    });

    var calendar = new Calendar(calendarEl, {
      plugins: [ 'bootstrap', 'interaction', 'dayGrid', 'timeGrid' ],
      header    : {
        left  : 'prev,next today',
        center: 'title',
        right : 'dayGridMonth,timeGridWeek,timeGridDay'
      },
      //Random default events
      events    : [
      ],
      editable  : true,
      droppable : true, // this allows things to be dropped onto the calendar !!!
      drop      : function(info) {
        // is the "remove after drop" checkbox checked?
        if (checkbox.checked) {
          // if so, remove the element from the "Draggable Events" list
          info.draggedEl.parentNode.removeChild(info.draggedEl);
        }
      }    
    });

    calendar.render();
    // $('#calendar').fullCalendar()

    /* ADDING EVENTS */
    var currColor = '#ffffff' //Red by default
    //Color chooser button
    var colorChooser = $('#color-chooser-btn')
    $('#color-chooser > li > a').click(function (e) {
      e.preventDefault()
      //Save color
      currColor = $(this).css('color')
      //Add color effect to button
      $('#add-new-event').css({
      })
    })
    $('#add-new-event').click(function (e) {
      e.preventDefault()
      //Get value and make sure it is not null
      var val = $('#new-event').val()
      if (val.length == 0) {
        return
      }

      //Create events
      var event = $('<div />')
      event.css({
        'background-color': currColor,
        'border-color'    : currColor,
        'color'           : '#fff'
      }).addClass('external-event')
      event.html(val)
      $('#external-events').prepend(event)

      //Add draggable funtionality
      ini_events(event)

      //Remove event from text input
      $('#new-event').val('')
    })
  })
</script>
</body>
</html>
