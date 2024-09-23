  <script setup>
  </script>


<template>
    <header class="header">
      <h2>Home</h2>
      <div class="user">
        <svg class="icon-user" viewBox="0 0 50 50" fill="none" xmlns="http://www.w3.org/2000/svg">
            <circle cx="24.3715" cy="24.4708" r="23.7928" fill="#63676C"/>
            <mask id="mask0_22_19" style="mask-type:alpha" maskUnits="userSpaceOnUse" x="0" y="0" width="49" height="49">
            <circle cx="24.3715" cy="24.4708" r="23.7928" fill="#63676C"/>
            </mask>
            <g mask="url(#mask0_22_19)">
            <circle cx="24.3715" cy="15.5485" r="5.9482" fill="white"/>
            <circle cx="24.0741" cy="40.2337" r="15.7627" fill="white"/>
            </g>
        </svg>
        <span>Discente</span>
        <svg class="icon-down-arrow" viewBox="0 0 18 12" fill="none" xmlns="http://www.w3.org/2000/svg">
            <path d="M1.5426 0.901855L9.27526 10.419L17.0079 0.901855" stroke="#63676C" stroke-width="1.78446" stroke-linecap="round" stroke-linejoin="round"/>
        </svg>
      </div>
    </header>
  </template>
  
  
  <style scoped>
  .header {
    display: flex;
    justify-content: space-between;
    align-items: center;
    padding: 20px;
    border-bottom: 1px solid #ccc;
  }
  
  .user {
    display: flex;
    align-items: center;
    margin-right: 3%;
    padding: 15px 20px;
    border-radius: 15px;
  }
  
  .icon-user {
    width: 30px;
    height: 30px;
    border-radius: 50%;
    margin-right: 10px;
  }

  .icon-down-arrow {
    width: 18px;
    height: 12px;
    border-radius: 50%;
    margin-left: 10px;
  }
  </style>
  