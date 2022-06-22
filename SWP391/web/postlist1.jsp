<%-- 
    Document   : post_list
    Created on : Jun 22, 2022, 3:08:18 AM
    Author     : Admin
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Post_List</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <!--CSS-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <link rel="stylesheet" href="css/style.css"/>
        <link rel="stylesheet" href="css/post_list.css"/>
          <!--font-awesome-->
        <script src="https://kit.fontawesome.com/3c84cb624f.js" crossorigin="anonymous"></script>
    </head>
    <body>
        <div class="header">
            <c:import url="navbar.jsp"></c:import>
        </div>
        <div class="row container">
            <div class="row col-3">
                <c:import url="marketing_sider.jsp"></c:import>
            </div>
                   <!--content--> 
            <div class="col-9">
                                        <!-- header  -->
                       <div data-v-b2f6143e="" data-v-75520c46="" id="product-filter-card" class="product-filter-card">
                           <form data-v-b2f6143e="" autocomplete="off" class="shopee-form filter-form shopee-form--label-right">
                               <div data-v-b2f6143e="" class="filter-form-box">
                                   <div data-v-b2f6143e="" class="filter-col-left">
                                       <div data-v-b2f6143e="" class="product shopee-form-item"><label
                                               class="shopee-form-item__label empty">
                                               <!---->
                                           </label>
                                           <div class="shopee-form-item__control">
                                               <div class="shopee-form-item__content">
                                                   <div data-v-b2f6143e="" class="shopee-input-group"><span
                                                           class="shopee-input-group__prepend" style="width: 152px;">
                                                           <div data-v-b2f6143e="" class="shopee-select">
                                                               <div data-v-2449cb06="" tabindex="0"
                                                                   class="shopee-selector shopee-selector--normal">
                                                                   <!---->
                                                                   <div data-v-2449cb06="" class="shopee-selector__inner line-clamp--1">Tên
                                                                       sản phẩm

                                                                   </div>
                                                                   <div data-v-2449cb06="" class="shopee-selector__suffix">
                                                                       <!----> <i data-v-2449cb06=""
                                                                           class="shopee-selector__suffix-icon shopee-icon"><svg
                                                                               xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                                                               <path
                                                                                   d="M8,9.18933983 L4.03033009,5.21966991 C3.73743687,4.9267767 3.26256313,4.9267767 2.96966991,5.21966991 C2.6767767,5.51256313 2.6767767,5.98743687 2.96966991,6.28033009 L7.46966991,10.7803301 C7.76256313,11.0732233 8.23743687,11.0732233 8.53033009,10.7803301 L13.0303301,6.28033009 C13.3232233,5.98743687 13.3232233,5.51256313 13.0303301,5.21966991 C12.7374369,4.9267767 12.2625631,4.9267767 11.9696699,5.21966991 L8,9.18933983 Z">

                                                                               </path>
                                                                           </svg>
                                                                       </i>
                                                                   </div>
                                                               </div>
                                                               <div class="shopee-popper" style="display: none;">
                                                                   <!---->
                                                                   <div class="shopee-select__menu"
                                                                       style="max-width: 440px; max-height: 218px;">
                                                                       <div class="shopee-scrollbar">
                                                                           <div class="shopee-scrollbar__wrapper">
                                                                               <div data-v-2449cb06=""
                                                                                   class="shopee-scrollbar__bar vertical">
                                                                                   <div data-v-2449cb06="" class="shopee-scrollbar__thumb"
                                                                                       style="top: 0px; height: 0px;">
                                                                                   </div>
                                                                               </div>
                                                                               <!---->
                                                                               <div class="shopee-scrollbar__content"
                                                                                   style="position: relative;">
                                                                                   <div class="shopee-select__options">
                                                                                       <div data-v-b2f6143e=""
                                                                                           class="shopee-option selected">
                                                                                           Tên sản phẩm
                                                                                           <!---->
                                                                                       </div>
                                                                                       <div data-v-b2f6143e="" class="shopee-option">
                                                                                           SKU sản phẩm
                                                                                           <!---->
                                                                                       </div>
                                                                                       <div data-v-b2f6143e="" class="shopee-option">
                                                                                           SKU phân loại
                                                                                           <!---->
                                                                                       </div>
                                                                                       <div data-v-b2f6143e="" class="shopee-option">
                                                                                           Phân loại hàng
                                                                                           <!---->
                                                                                       </div>
                                                                                       <div data-v-b2f6143e="" class="shopee-option">
                                                                                           Mã sản phẩm
                                                                                           <!---->
                                                                                       </div>
                                                                                   </div>
                                                                                   <div class="resize-triggers">
                                                                                       <div class="expand-trigger">
                                                                                           <div style="width: 1px; height: 1px;">
                                                                                           </div>
                                                                                       </div>
                                                                                       <div class="contract-trigger">

                                                                                       </div>
                                                                                   </div>
                                                                               </div>
                                                                           </div>
                                                                       </div>
                                                                   </div>
                                                                   <p class="shopee-select__filter-empty" style="display: none;">
                                                                   </p>
                                                                   <!---->
                                                               </div>
                                                           </div>
                                                       </span> <span class="shopee-input-group__append">
                                                           <div data-v-87f4ef20="" data-v-b2f6143e="" class="hints-input">
                                                               <div data-v-87f4ef20="" class="input-wrapper">
                                                                   <div data-v-87f4ef20="" class="shopee-input original-input">
                                                                       <div class="shopee-input__inner shopee-input__inner--normal">
                                                                           <!----> <input type="text"
                                                                               placeholder="Please input at least 2 character"
                                                                               resize="vertical" rows="2" minrows="2"
                                                                               restrictiontype="input" max="Infinity" min="-Infinity"
                                                                               class="shopee-input__input">
                                                                           <!---->
                                                                       </div>

                                                                   </div>
                                                               </div>
                                                               <!---->
                                                           </div>
                                                       </span>
                                                       <!---->
                                                   </div>
                                               </div>
                                               <!---->
                                               <!---->
                                           </div>
                                       </div>
                                       <div data-v-b2f6143e="" class="stock shopee-form-item"><label for="stock"
                                               class="shopee-form-item__label empty">
                                               <!---->
                                           </label>
                                           <div class="shopee-form-item__control">
                                               <div class="shopee-form-item__content"><span data-v-b2f6143e=""
                                                       style="margin-right: 16px;">Kho hàng
                                                   </span>
                                                   <div data-v-b2f6143e="" class="shopee-form-item__content">
                                                       <div data-v-b2f6143e=""
                                                           class="shopee-input shopee-number-input shopee-number-input--normal shopee-number-input--no-suffix">
                                                           <div class="shopee-input__inner shopee-input__inner--normal">
                                                               <!----> <input type="text" placeholder="Min" resize="vertical" rows="2"
                                                                   minrows="2" restrictiontype="value" max="Infinity" min="-Infinity"
                                                                   class="shopee-input__input">
                                                               <div class="shopee-input__suffix">

                                                                   <div class="shopee-number-input__controls">
                                                                       <div class="shopee-number-input__control up"><i
                                                                               class="shopee-icon"><svg xmlns="http://www.w3.org/2000/svg"
                                                                                   viewBox="0 0 16 16">
                                                                                   <path fill-rule="evenodd"
                                                                                       d="M7.57253679,6.40074676 L5.1530248,8.66903925 C4.90120463,8.90512066 4.88844585,9.30064304 5.12452726,9.55246321 C5.24268191,9.67849483 5.40773242,9.75 5.58048801,9.75 L10.419512,9.75 C10.76469,9.75 11.044512,9.47017797 11.044512,9.125 C11.044512,8.95224442 10.9730068,8.7871939 10.8469752,8.66903925 L8.42746321,6.40074676 C8.18705183,6.17536109 7.81294817,6.17536109 7.57253679,6.40074676 Z">

                                                                                   </path>
                                                                               </svg>
                                                                           </i>
                                                                       </div>
                                                                       <div class="shopee-number-input__control down"><i
                                                                               class="shopee-icon"><svg xmlns="http://www.w3.org/2000/svg"
                                                                                   viewBox="0 0 16 16">
                                                                                   <path fill-rule="evenodd"
                                                                                       d="M7.57253679,9.34925324 L5.1530248,7.08096075 C4.90120463,6.84487934 4.88844585,6.44935696 5.12452726,6.19753679 C5.24268191,6.07150517 5.40773242,6 5.58048801,6 L10.419512,6 C10.76469,6 11.044512,6.27982203 11.044512,6.625 C11.044512,6.79775558 10.9730068,6.9628061 10.8469752,7.08096075 L8.42746321,9.34925324 C8.18705183,9.57463891 7.81294817,9.57463891 7.57253679,9.34925324 Z">
                                                                                   </path>
                                                                               </svg>
                                                                           </i>
                                                                       </div>
                                                                   </div>
                                                                   <!---->
                                                               </div>
                                                           </div>

                                                       </div> <span data-v-b2f6143e="" class="interim-line">

                                                       </span>
                                                       <div data-v-b2f6143e=""
                                                           class="shopee-input shopee-number-input shopee-number-input--normal shopee-number-input--no-suffix">
                                                           <div class="shopee-input__inner shopee-input__inner--normal">
                                                               <!----> <input type="text" placeholder="Max" resize="vertical" rows="2"
                                                                   minrows="2" restrictiontype="value" max="Infinity" min="-Infinity"
                                                                   class="shopee-input__input">
                                                               <div class="shopee-input__suffix">

                                                                   <div class="shopee-number-input__controls">
                                                                       <div class="shopee-number-input__control up"><i
                                                                               class="shopee-icon"><svg xmlns="http://www.w3.org/2000/svg"
                                                                                   viewBox="0 0 16 16">
                                                                                   <path fill-rule="evenodd"
                                                                                       d="M7.57253679,6.40074676 L5.1530248,8.66903925 C4.90120463,8.90512066 4.88844585,9.30064304 5.12452726,9.55246321 C5.24268191,9.67849483 5.40773242,9.75 5.58048801,9.75 L10.419512,9.75 C10.76469,9.75 11.044512,9.47017797 11.044512,9.125 C11.044512,8.95224442 10.9730068,8.7871939 10.8469752,8.66903925 L8.42746321,6.40074676 C8.18705183,6.17536109 7.81294817,6.17536109 7.57253679,6.40074676 Z">

                                                                                   </path>
                                                                               </svg>
                                                                           </i>
                                                                       </div>
                                                                       <div class="shopee-number-input__control down"><i
                                                                               class="shopee-icon"><svg xmlns="http://www.w3.org/2000/svg"
                                                                                   viewBox="0 0 16 16">
                                                                                   <path fill-rule="evenodd"
                                                                                       d="M7.57253679,9.34925324 L5.1530248,7.08096075 C4.90120463,6.84487934 4.88844585,6.44935696 5.12452726,6.19753679 C5.24268191,6.07150517 5.40773242,6 5.58048801,6 L10.419512,6 C10.76469,6 11.044512,6.27982203 11.044512,6.625 C11.044512,6.79775558 10.9730068,6.9628061 10.8469752,7.08096075 L8.42746321,9.34925324 C8.18705183,9.57463891 7.81294817,9.57463891 7.57253679,9.34925324 Z">

                                                                                   </path>
                                                                               </svg>
                                                                           </i>
                                                                       </div>
                                                                   </div>

                                                               </div>
                                                           </div>

                                                       </div>
                                                   </div>
                                               </div>

                                           </div>
                                       </div>
                                   </div>
                                   <div data-v-b2f6143e="" class="filter-col-right">
                                       <div data-v-b2f6143e="" class="shopee-form-item"><label class="shopee-form-item__label">
                                               <!----> Danh mục
                                           </label>
                                           <div class="shopee-form-item__control">
                                               <div class="shopee-form-item__content">
                                                   <div data-v-b2f6143e="" class="category-input-wrapper">
                                                       <div data-v-5bb79eae="" data-v-d87484fc="" data-v-b2f6143e=""
                                                           class="popover-wrap attribute-text" edit-text="Sửa">
                                                           <div data-v-d87484fc="" data-v-5bb79eae="" class="category-input">
                                                               <div data-v-d87484fc="" data-v-5bb79eae=""
                                                                   class="category-name hover-pointer has-btn"><span data-v-d87484fc=""
                                                                       data-v-5bb79eae="" class="cat-selected-wrapper"><span
                                                                           data-v-d87484fc="" data-v-5bb79eae="" class="placeholder">Select

                                                                       </span>
                                                                   </span>
                                                               </div> <button data-v-d87484fc="" type="button"
                                                                   class="edit-btn shopee-button shopee-button--link shopee-button--normal"
                                                                   data-v-5bb79eae=""><i class="shopee-icon"><svg data-name="图层 1"
                                                                           xmlns="http://www.w3.org/2000/svg" viewBox="0 0 1024 1024">
                                                                           <path
                                                                               d="M988.1 316.06a127.07 127.07 0 0 0-37.5-90.5L798.4 73.36c-49.9-49.9-131.1-49.9-181.1 0l-91.8 91.8-.3.3-.3.3-470.2 470.4a63.47 63.47 0 0 0-18.8 45.2v242.7a64.06 64.06 0 0 0 64 64h242.8a63.47 63.47 0 0 0 45.2-18.8l470.6-470.6 92.1-92.1a127.07 127.07 0 0 0 37.5-90.5zm-842.9 320l402.7-402.7 242.8 242.7-402.8 402.8zm-45.3 288v-242.7l242.7 242.7zm805.5-562.7l-69.5 69.4-242.7-242.7 69.5-69.5a64.22 64.22 0 0 1 90.6 0l152.2 152.2a64.37 64.37 0 0 1-.1 90.6z"
                                                                               data-name="Layer 1">

                                                                           </path>
                                                                       </svg>
                                                                   </i>
                                                               </button>
                                                           </div>
                                                       </div>
                                                   </div>
                                               </div>

                                           </div>
                                       </div>
                                       <div data-v-b2f6143e="" class="range-input shopee-form-item"><label for="sold"
                                               class="shopee-form-item__label">
                                               <!----> Doanh số
                                           </label>
                                           <div class="shopee-form-item__control">
                                               <div class="shopee-form-item__content">
                                                   <div data-v-b2f6143e=""
                                                       class="shopee-input shopee-number-input shopee-number-input--normal shopee-number-input--no-suffix">
                                                       <div class="shopee-input__inner shopee-input__inner--normal">
                                                           <!----> <input type="text" placeholder="Min" resize="vertical" rows="2"
                                                               minrows="2" restrictiontype="value" max="Infinity" min="-Infinity"
                                                               class="shopee-input__input">
                                                           <div class="shopee-input__suffix">

                                                               <div class="shopee-number-input__controls">
                                                                   <div class="shopee-number-input__control up"><i class="shopee-icon"><svg
                                                                               xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                                                               <path fill-rule="evenodd"
                                                                                   d="M7.57253679,6.40074676 L5.1530248,8.66903925 C4.90120463,8.90512066 4.88844585,9.30064304 5.12452726,9.55246321 C5.24268191,9.67849483 5.40773242,9.75 5.58048801,9.75 L10.419512,9.75 C10.76469,9.75 11.044512,9.47017797 11.044512,9.125 C11.044512,8.95224442 10.9730068,8.7871939 10.8469752,8.66903925 L8.42746321,6.40074676 C8.18705183,6.17536109 7.81294817,6.17536109 7.57253679,6.40074676 Z">

                                                                               </path>
                                                                           </svg>
                                                                       </i>
                                                                   </div>
                                                                   <div class="shopee-number-input__control down"><i
                                                                           class="shopee-icon"><svg xmlns="http://www.w3.org/2000/svg"
                                                                               viewBox="0 0 16 16">
                                                                               <path fill-rule="evenodd"
                                                                                   d="M7.57253679,9.34925324 L5.1530248,7.08096075 C4.90120463,6.84487934 4.88844585,6.44935696 5.12452726,6.19753679 C5.24268191,6.07150517 5.40773242,6 5.58048801,6 L10.419512,6 C10.76469,6 11.044512,6.27982203 11.044512,6.625 C11.044512,6.79775558 10.9730068,6.9628061 10.8469752,7.08096075 L8.42746321,9.34925324 C8.18705183,9.57463891 7.81294817,9.57463891 7.57253679,9.34925324 Z">

                                                                               </path>
                                                                           </svg>
                                                                       </i>
                                                                   </div>
                                                               </div>
                                                           </div>
                                                       </div>

                                                   </div> <span data-v-b2f6143e="" class="connector">

                                                   </span>
                                                   <div data-v-b2f6143e=""
                                                       class="shopee-input shopee-number-input shopee-number-input--normal shopee-number-input--no-suffix">
                                                       <div class="shopee-input__inner shopee-input__inner--normal">
                                                           <!----> <input type="text" placeholder="Max" resize="vertical" rows="2"
                                                               minrows="2" restrictiontype="value" max="Infinity" min="-Infinity"
                                                               class="shopee-input__input">
                                                           <div class="shopee-input__suffix">

                                                               <div class="shopee-number-input__controls">
                                                                   <div class="shopee-number-input__control up"><i class="shopee-icon"><svg
                                                                               xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                                                               <path fill-rule="evenodd"
                                                                                   d="M7.57253679,6.40074676 L5.1530248,8.66903925 C4.90120463,8.90512066 4.88844585,9.30064304 5.12452726,9.55246321 C5.24268191,9.67849483 5.40773242,9.75 5.58048801,9.75 L10.419512,9.75 C10.76469,9.75 11.044512,9.47017797 11.044512,9.125 C11.044512,8.95224442 10.9730068,8.7871939 10.8469752,8.66903925 L8.42746321,6.40074676 C8.18705183,6.17536109 7.81294817,6.17536109 7.57253679,6.40074676 Z">

                                                                               </path>
                                                                           </svg>
                                                                       </i>
                                                                   </div>
                                                                   <div class="shopee-number-input__control down"><i
                                                                           class="shopee-icon"><svg xmlns="http://www.w3.org/2000/svg"
                                                                               viewBox="0 0 16 16">
                                                                               <path fill-rule="evenodd"
                                                                                   d="M7.57253679,9.34925324 L5.1530248,7.08096075 C4.90120463,6.84487934 4.88844585,6.44935696 5.12452726,6.19753679 C5.24268191,6.07150517 5.40773242,6 5.58048801,6 L10.419512,6 C10.76469,6 11.044512,6.27982203 11.044512,6.625 C11.044512,6.79775558 10.9730068,6.9628061 10.8469752,7.08096075 L8.42746321,9.34925324 C8.18705183,9.57463891 7.81294817,9.57463891 7.57253679,9.34925324 Z">

                                                                               </path>
                                                                           </svg>
                                                                       </i>
                                                                   </div>
                                                               </div>
                                                           </div>
                                                       </div>

                                                   </div>
                                               </div>

                                           </div>
                                       </div>
                                   </div>
                               </div>
                               <div data-v-b2f6143e="" class="actions"><button data-v-b2f6143e="" type="button"
                                       class="shopee-button shopee-button--primary shopee-button--normal"><span>
                                           Tìm

                                       </span>
                                   </button> <button data-v-b2f6143e="" type="button" class="shopee-button shopee-button--normal"
                                       style="margin-left: 16px;"><span>
                                           Nhập Lại

                                       </span>
                                   </button>
                               </div>
                           </form>
                       </div>

                       <!-- NavBar  -->
                       <div data-v-75520c46="" class="product-list-main">
                           <div data-v-dff31658="" data-v-75520c46="" class="shopee-fixed-top-card">
                               <div data-v-dff31658="" class="fixed-container" style="top: 56px; z-index: 1000;">
                                   <div data-v-75520c46="" data-v-dff31658="" class="portal-panel">
                                       <div data-v-75520c46="" class="tabs shopee-tabs shopee-tabs-line shopee-tabs-normal shopee-tabs-top"
                                           data-v-dff31658="">
                                           <div class="shopee-tabs__nav">
                                               <div class="shopee-tabs__nav-warp">
                                                   <div class="shopee-tabs__nav-tabs" style="transform: translateX(0px);">
                                                       <div class="shopee-tabs__nav-tab" style="white-space: normal;">
                                                           <div data-v-75520c46="" class="tabs__tab">Tất cả

                                                           </div>
                                                       </div>
                                                       <div class="shopee-tabs__nav-tab" style="white-space: normal;">
                                                           <div data-v-75520c46="" class="tabs__tab">Đang hoạt động

                                                           </div>
                                                       </div>
                                                       <div class="shopee-tabs__nav-tab active" style="white-space: normal;">
                                                           <div data-v-75520c46="" class="tabs__tab">Hết hàng
                                                               <span class="tab-badge">0

                                                               </span>
                                                           </div>
                                                       </div>
                                                       <div class="shopee-tabs__nav-tab" style="white-space: normal;">
                                                           <div data-v-75520c46="" class="tabs__tab">Chờ duyệt
                                                               <span class="tab-badge">0

                                                               </span>
                                                           </div>
                                                       </div>
                                                       <div class="shopee-tabs__nav-tab" style="white-space: normal;">
                                                           <div data-v-75520c46="" class="tabs__tab">Vi phạm
                                                               <span class="tab-badge">5

                                                               </span>
                                                           </div>
                                                       </div>
                                                       <div class="shopee-tabs__nav-tab" style="white-space: normal;">
                                                           <div data-v-75520c46="" class="tabs__tab">Đã ẩn
                                                               <span class="tab-badge">1

                                                               </span>
                                                           </div>
                                                       </div>
                                                   </div>
                                                   <div class="shopee-tabs__ink-bar" style="width: 104px; transform: translateX(203px);">
                                                   </div>
                                               </div>
                                           </div>
                                           <div class="shopee-tabs__content">
                                               <div data-v-75520c46="" class="shopee-tabs-tabpane" style="display: none;">
                                               </div>
                                               <div data-v-75520c46="" class="shopee-tabs-tabpane" style="display: none;">
                                               </div>
                                               <div data-v-75520c46="" class="shopee-tabs-tabpane">

                                               </div>
                                               <div data-v-75520c46="" class="shopee-tabs-tabpane" style="display: none;">
                                               </div>
                                               <div data-v-75520c46="" class="shopee-tabs-tabpane" style="display: none;">
                                               </div>
                                               <div data-v-75520c46="" class="shopee-tabs-tabpane" style="display: none;">
                                               </div>
                                           </div>
                                       </div>
                                   </div>
                               </div>
                               <div data-v-dff31658="" class="fixed-placeholder" style="display: none; height: 54px;">
                               </div>
                           </div>
                       </div>
            </div>
         </div>
    </body>
</html>
