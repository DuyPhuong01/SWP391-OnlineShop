<%-- 
    Document   : ckeditor
    Created on : June 23, 2022, 7:55:53 PM
    Author     : tretr
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en" dir="ltr">
    <head>
        <meta charset="utf-8">
          <title>Post_List</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <!--CSS-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
         <link rel="stylesheet" href="../css/style.css"/>
        <!--CK finder-->
        <script type="text/javascript" src="../ckeditor/ckeditor.js"></script>
        <script type="text/javascript" src="../ckfinder/ckfinder.js"></script>
         <!--font-awesome-->
        <script src="https://kit.fontawesome.com/3c84cb624f.js" crossorigin="anonymous"></script>
        <script src="../js/marketing/post_list.js"> </script>
        <script src="css/post_list.css"> </script>
    </head>
    <body>
          <!--Ajax-->
          
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
         <div class="row container main-page">
            <div class="row col-3">
                <c:import url="sidebar.jsp"></c:import>
            </div>
            <!--content--> 
            
            
      <div class="col-9 main-form">
       <form id="post_list" action="addpost" method="post" enctype="multipart/form-data">               
                        <!-- header  -->
          <div data-v-b2f6143e="" data-v-75520c46="" id="product-filter-card" class="product-filter-card">
                            
              <div class="container list-input">
                  <div class="list-input list-input__title"> <h1>Create new post</h1></div>
                  
                  <div class="list-input list-input__title col-12">
                      <div class="col-2 ceate-title">
                          <h5>Title</h5>
                      </div>
                      
                      <div class="col-1 ceate-title">
                          
                      </div>
                      <div class="col-9 ceate-title">
                          <input id="title-add" name="title" required type="text" />
                      </div>
                  </div>
                  <div class="list-input list-input__title col-12">
                      <div class="col-2 ceate-title">
                          <h5>Author</h5>
                      </div>
                      
                      <div class="col-1 ceate-title">
                          
                      </div>
                      <div class="col-9 ceate-title">
                          <input  readonly name="autitle-addthor" type="text" value="${sessionScope.account.username}" />
                      </div>
                  </div>
                  <div class="list-input list-input__title col-12">
                      <div class="col-2 ceate-title">
                          <h5>Category</h5>
                      </div>
                      
                      <div class="col-1 ceate-title">
                               
                      </div>
                      <div class="col-3 ceate-title category-content" id="category-content">
                          <select name="category" id="category-select"
                                  onchange="checkCategoryOption()" required>
                              <option  selected disabled>Select</option>
                              <c:forEach items="${requestScope.categories}" var="category"> 
                                  <option value="${category.category_id}">${category.category_name}
                                  </option>
                              </c:forEach>
                          </select>
                      </div>
                      <div class="col-1 ceate-title">
                      </div>
                      <div class="col-1 ceate-title">
                          <h5>Sub Category</h5>
                      </div>
                         <div class="col-4 ceate-title category-content" id="category-content">
                          <select name="sub_category" id="sub_category" 
                                   required>
                              <option  selected disabled>Select</option>
                              <!--<option value="0" onclick="openCategoryForm()" >Add More</option>-->
                          </select>
                      </div>
                  </div>
                     
                  <!--get data-->
               
                  
                  <!--category form-->
                <div class="modal category-form" id="category-form" tabindex="-1" >
                    <div class="modal-dialog">
                  <div class="modal-content">
                    <div class="modal-header">
                      <h5 class="modal-title">New Category</h5>
                  <button type="button" id="addnew-form" class="btn-close"  onclick="closeCategoryForm()" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <form id="category-form_add" action="addpostcategory" method="post">
                        <p>
                                    <div class="input-group mb-3">
                                      <div class="input-group-prepend">
                                        <span class="input-group-text" id="inputGroup-sizing-default">Name</span>
                                      </div>
                                        <input required oninput="CheckCategoryName(this)"  type="text" 
                                             id="name"   name="name" 
                                             class="form-control" aria-label="Default" aria-describedby="inputGroup-sizing-default"
                                             >
                                    </div>
                                <div class="category-error" id="category-error">
                                 <span  class="category-error_item">This name have exist</span>
                                </div>
                                    <div class="input-group mb-3">
                                      <div class="input-group-prepend">
                                        <span class="input-group-text" id="inputGroup-sizing-default">Description</span>
                                      </div>
                                        <input  id="description" type="text" name="description" class="form-control" aria-label="Default" aria-describedby="inputGroup-sizing-default">
                                    </div>
                        </p>
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal" onclick="closeCategoryForm()">Close</button>
                        <button type="button" id="submit-category" class="btn btn-primary" onclick="SubmitCategoryForm()">Submit</button>
                    </div>
                  </div>
                </div>
              </div>
                  <!----------------------------->
<!--                  <form id="category-form_add" action="addpostcategory" method="post">
                      <input type="text" hidden name="name" id="name-form"/>
                      <input type="text" hidden name="description" id="description-form" />
                  </form>-->
                  
                  <div class="list-input list-input__title col-12">
                      <div class="col-2 ceate-title">
                          <h5>Feature</h5>
                      </div>
                      
                      <div class="col-1 ceate-title">
                          
                      </div>
                      <div class="col-9 ceate-title">
                          <select name="feature" id="feature-select" required>
                              <option  selected disabled>Select</option>
                              <option value="1">Show</option>
                              <option value="0">Hide</option>
                          </select>
                      </div>
                  </div>
                  <div class="list-input list-input__title col-12 thumbnail-create">
                      <div class="col-2 ceate-title">
                          <h5>Upload Thumbnail</h5>
                      </div>
                      
                      <div class="col-1 ceate-title">
                          
                      </div>
                      <div class="col-9 ceate-title">
                          <input required type="file" id="imageFile"
                                 onchange="chooseFile(this)"
                                 name="thumbnail" accept="image/gif, image/jpeg, image/png"/>
                      </div>
                  </div>
                  <div class="list-input list-input__title col-12 thumbnail-container">
                          
                      <img src="" alt="" id="thumbnail-create" >
                  </div>            
                  <div class="list-input list-input__title col-12 content-create__container">
                      <div class="content-create__title"><p>Post details<p><div>
                      <div  class="content-create__detail">
                           <textarea id="ckeditorArea" required></textarea>
                           <input id="content" type="hidden" name="content"required />
                            <button type="button" class="btn btn-primary" onclick="saveData()">Submit</button>
                            <!--<button type="submit" class="btn btn-primary">Submit</button>-->
                      </div>
                  </div>            
                         
         </div>
                      
        </form>      
       </div>
    
        
        
        
        
        
        
        
        
        
        
        
        
        
<!--        <form id="formEditor" method="post" action="addlist">
            <textarea id="ckeditorArea"></textarea>
            <input id="content" type="hidden" name="content" />
            <input type="button" value="Save" onclick="saveData()"/>
        </form>-->
        
        <!--<div>${content}</div>-->
    </body>
    <script type="text/javascript">
        var editor = CKEDITOR.replace('ckeditorArea'
        , 
           {
                filebrowserBrowseUrl : 'ckfinder/ckfinder.html',
                filebrowserImageBrowseUrl : 'ckfinder/ckfinder.html?type=Images',
                filebrowserFlashBrowseUrl : 'ckfinder/ckfinder.html?type=Flash',
                filebrowserUploadUrl : 'ckfinder/core/connector/java/connector.java?command=QuickUpload&type=Files',
                filebrowserImageUploadUrl : 'ckfinder/core/connector/java/connector.java?command=QuickUpload&type=Images',
                filebrowserFlashUploadUrl : 'ckfinder/core/connector/java/connector.java?command=QuickUpload&type=Flash'
            });
            
//        var editor = CKEDITOR.replace('ckeditorArea');
//        CKFinder.setupCKEditor(editor, './ckfinder/');
               function validate(){
           var feature=$('#feature-select').children("option:selected").val();
            var category=$('#category-select').children("option:selected").val();
            var title=document.getElementById('title-add').value;
            var thumbnail=document.getElementById('imageFile').value;
            
            if(title==''){
                alert( "Please provide your title!" );
                $('#title-add').focus();
                return false;
            }
            if(category=='Select'||$('#sub_category').children("option:selected").val()=='Select'){
                 alert( "Please provide your category!" );
                 $('#category-select').children("option:selected").focus();
                 return false;
            }
            if(feature==='Select'){
                alert( "Please provide your feature!" );
                $('#feature-select').children("option:selected").focus();
                return false;
            }
            if(thumbnail==''){
                alert( "Please provide your thumbnail!" );
                $('#imageFile').focus();
                return false;
            }
            return true;
        }
        
        function saveData() {
            const post = editor.getData();
            if(validate()){
//            var formValid=document.forms['post_list'].checkValidity();
            if(post.trim('')==''){
                alert('You need fill post details');
            }else{
            document.querySelector('#content').value = post;
            document.querySelector('#post_list').submit();   
            }
            }
        }
    </script>
</html>