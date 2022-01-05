<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="Resumestyle.css">
    <link href="https://fonts.googleapis.com/css2?family=Montserrat&display=swap" rel="stylesheet">
    <title>Resume Builder</title>
</head>
<body>


     <table id="header" border="0" width="100%" cellpadding="0" cellspacing="0" bgcolor="#ADD8E6">
        <tr>
            <td>
                <table border="0" width="0%" cellpadding="15" cellspacing="0" align="center">
                    <tr>
                    
                        <td >
                            &nbsp;
                        </td>
                        <td>
                            <a href="HomePage.jsp"><font face="arial" color="#000000" size="4">Home</font></a>
                        </td>
                        <td>
                            <a href="login.jsp"><font face="arial" color="#000000" size="4">Login</font></a>
                        </td>
                  
                        <td>
                            <a href="memberRegistration.jsp "><font face="arial" color="#000000" size="4">Register</font></a>
                            
                        </td>
                      
                    </tr>
                </table>
            </td>

        </tr>


    </table>

    <form class="input-fields">

          <h1 style="text-align: center ;" style="background-color: powderblue ;" >Resume Generator</h1>
          <td align="center"> Name  </td>
          <input type="text" name="name" placeholder="name" />
          <td align="center"> Title  </td>
          <input type="text" name="title" placeholder="Title eg web developer" />
          <td align="center"> Work Experience  </td>
          <textarea name="workexp" placeholder="work experience"></textarea>
          <td align="center"> Academic Details  </td>
          <textarea name="academics" placeholder="academic details"></textarea>
          <td align="center"> Objective  </td>
          <input name="objective" placeholder="objective" />
          <td align="center"> Skills  </td>
          <textarea name="skills" placeholder="skills" ></textarea>
          <td align="center"> Projects  </td>
          <textarea name="projects" placeholder="projects" ></textarea>
          <td align="center"> Achievements  </td>
          <textarea name="achievements" placeholder="achievements" ></textarea>
          <td align="center"> Contact  </td>
          <textarea name="contact" placeholder="contact" ></textarea>
    </form>
     <!-- resume preview -->
    <div class="output">
   
    </div>  
    <!-- button for toggle   -->
   <div class="btn">
        <button onclick="toggle()">Preview or edit</button>
   </div>
   
   <script src="https://cdn.ckeditor.com/ckeditor5/27.1.0/classic/ckeditor.js"></script>
    <script src="./app.js"></script>
    
</body>
</html>
