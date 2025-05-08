


# ✨ Todo-Ddudo!  
> 함께 목표를 실천하는 협업형 To-do 플랫폼

---


![image](https://github.com/user-attachments/assets/bb7604bb-9069-482c-a233-37a47f0930e3)


---

## 📚 목차 (Table of Contents)

- [DDIS 팀 소개](#meet-the-ddis-team-members)  
- [기획 의도](#기획-의도)
- [Tech Stack](#tech-stack)  
- [주요 기능 소개](#주요-기능)  
- [UI/UX 설계](#uiux-설계)  
- [CI/CD 설계](#cicd-설계)  
- [팀원 회고](#팀원-회고)
- [설계문서](#설계-문서)

---


## Meet the **DDIS** Team Members

<table align="center">
  <tr>
    <td align="center"><img src="https://github.com/user-attachments/assets/c878ec33-a47f-4407-a037-2589a0fa5785" width="400"/><br/>이성준<br/><a href="https://github.com/1214alex">@1214alex</a></td>
    <td align="center"><img src="https://github.com/user-attachments/assets/a55578f2-36c3-4e87-a4a6-63f602d43eed" width="400"/><br/>강이도은<br/><a href="https://github.com/RKDLDE">@RKDLDE</a></td>
    <td align="center"><img src="https://avatars.githubusercontent.com/u/66666666?s=100"/><br/>고도연<br/><a href="https://github.com/github-id2" width="400">@github-id2</a></td>
  </tr>
  <tr>
    <td align="center"><img src="https://avatars.githubusercontent.com/u/33333333?s=100"/><br/>김기종<br/><a href="https://github.com/rrangeess">@rrangeess</a></td>
    <td align="center"><img src="https://avatars.githubusercontent.com/u/44444444?s=100"/><br/>주아현<br/><a href="https://github.com/github-id4">@github-id4</a></td>
    <td align="center"><img src="https://avatars.githubusercontent.com/u/55555555?s=100"/><br/>한윤상<br/><a href="https://github.com/github-id5">@github-id5</a></td>
  </tr>
</table>

---


</center>

# 기획 의도

### 📌 프로젝트 목표

> **“혼자는 어려워도, 함께하면 지켜낼 수 있어요.”**  
Todo-Ddudo는 협업 기반의 To-do 실천을 통해  
**사용자의 꾸준한 습관 형성과 목표 달성**을 돕는 소셜 플랫폼입니다.

---

### 📌 서비스 개요

**Todo-Ddudu**는 사용자들이 **목표 달성을 위해 함께 To-do를 실천**할 수 있는  
**협업 기반의 소셜 플랫폼**입니다.  
공동 To-do 방, 인증 시스템, 통계 시각화, 커뮤니티 기능을 통해  
사용자의 꾸준한 실천을 돕는 동기부여형 서비스입니다.

---

### 📌 서비스 배경

- 🙇‍♀️ 혼자서는 지키기 어려운 계획  
- 💬 친구들과의 약속은 지켜내는 나  
- 📉 단순한 체크리스트 앱으로는 부족했던 피드백과 자극

> Todo-Ddudu는 ‘**함께하는 실천**’에 초점을 맞춘 To-do 플랫폼입니다.  
공동 목표 설정 → 인증 → 승인 → 통계 피드백까지!  
**실천을 위한 선순환 구조**를 제공합니다.

---

### 📌 서비스 설명

1. 회원가입 및 로그인 (소셜 로그인 포함)  
2. 모집 게시글로 공동 목표 멤버 모집  
3. 공동 To-do 방 자동 생성  
4. 인증 시스템(텍스트/이미지 + 피드백 기능)  
5. 달성률 및 피드백 통계 시각화  
6. 커뮤니티 신고/관리 시스템

---

# Tech Stack

> 프론트엔드(Vue.js)와 백엔드(Spring Boot)가 완전히 분리된 구조이며,  
> 실시간 채팅, 통계 시각화, JWT 인증, CI/CD 파이프라인 및 GitOps 배포까지 통합된 풀스택 프로젝트입니다.

***

### 🎨 Design & Modeling
![Figma](https://img.shields.io/badge/Figma-F24E1E?style=for-the-badge&logo=figma&logoColor=white)
![draw.io](https://img.shields.io/badge/draw.io-F08705?style=for-the-badge&logo=diagramsdotnet&logoColor=white)
![DA#](https://img.shields.io/badge/DA%23-ERD--Modeling-005CA9?style=for-the-badge)

***

### 🚀 Frontend
![Vue.js](https://img.shields.io/badge/Vue.js-3.x-35495E?style=for-the-badge&logo=vue.js&logoColor=4FC08D)
![JavaScript](https://img.shields.io/badge/JavaScript-ES6+-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black)
![Pinia](https://img.shields.io/badge/Pinia-State--Mgmt-ffe600?style=for-the-badge&logo=pinia&logoColor=black)
![Vue Router](https://img.shields.io/badge/Vue--Router-SPA-42B983?style=for-the-badge)
![Axios](https://img.shields.io/badge/Axios-REST--API-5A29E4?style=for-the-badge)
![v-calendar](https://img.shields.io/badge/V--Calendar-Date--Picker-42b883?style=for-the-badge)
![dayjs](https://img.shields.io/badge/Day.js-Date--Handling-ffb300?style=for-the-badge)
![vuedraggable](https://img.shields.io/badge/VueDraggable-Drag%20%26%20Drop-00c1d4?style=for-the-badge)
![Chart.js](https://img.shields.io/badge/Chart.js-Stats--Chart-FF6384?style=for-the-badge&logo=chartdotjs)
![ECharts](https://img.shields.io/badge/ECharts-Data--Viz-4A92E2?style=for-the-badge&logo=apacheecharts)
![Socket.IO](https://img.shields.io/badge/Socket.IO-Real--Time-000000?style=for-the-badge&logo=socket.io)
![STOMP.js](https://img.shields.io/badge/STOMP.js-Over--WebSocket-6e00ff?style=for-the-badge)
![Vite](https://img.shields.io/badge/Vite-Bundler-646CFF?style=for-the-badge&logo=vite&logoColor=white)

***

### ⚙️ Backend
![Java](https://img.shields.io/badge/Java-17-007396?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.4-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Spring Security](https://img.shields.io/badge/Spring%20Security-Auth-4CAF50?style=for-the-badge&logo=springsecurity)
![JWT](https://img.shields.io/badge/JJWT-Token--Auth-000000?style=for-the-badge&logo=jsonwebtokens)
![Spring WebSocket](https://img.shields.io/badge/Spring--WebSocket-Real--Time-6DB33F?style=for-the-badge)
![Freemarker](https://img.shields.io/badge/Freemarker-Template--Engine-1C7EBB?style=for-the-badge)
![WebJars](https://img.shields.io/badge/WebJars-Static--Assets-4B4B4B?style=for-the-badge)
![Gson](https://img.shields.io/badge/Gson-JSON--Parser-E64A19?style=for-the-badge)
![Spring Mail](https://img.shields.io/badge/Spring--Mail-Email--Auth-C80000?style=for-the-badge)
![Spring Validation](https://img.shields.io/badge/Spring--Validation-Form--Check-0d9488?style=for-the-badge)
![Spring Devtools](https://img.shields.io/badge/Spring--Devtools-Hot--Reload-FF5722?style=for-the-badge)

***

### 🧩 ORM & DB Frameworks
![Spring Data JPA](https://img.shields.io/badge/Spring%20Data%20JPA-ORM-59666C?style=for-the-badge)
![Hibernate](https://img.shields.io/badge/Hibernate-ORM-59666C?style=for-the-badge&logo=hibernate)
![MyBatis](https://img.shields.io/badge/MyBatis-SQL--Mapper-3D2C00?style=for-the-badge)
![ModelMapper](https://img.shields.io/badge/ModelMapper-DTO--Mapper-0d9488?style=for-the-badge)

***

### 🗃 Database
![MariaDB](https://img.shields.io/badge/MariaDB-Relational--DB-003545?style=for-the-badge&logo=mariadb)
![Redis](https://img.shields.io/badge/Redis-Session--Cache-DC382D?style=for-the-badge&logo=redis)

***

### 🧪 Testing
![JUnit5](https://img.shields.io/badge/JUnit5-Unit--Test-25A162?style=for-the-badge&logo=junit5)
![Spring Boot Test](https://img.shields.io/badge/Spring--Boot--Test-Integration--Test-6DB33F?style=for-the-badge)
![MyBatis Test](https://img.shields.io/badge/MyBatis--Test-Mapper--Validation-FF6600?style=for-the-badge)
![Spring Security Test](https://img.shields.io/badge/Spring--Security--Test-Mock--Auth-43A047?style=for-the-badge)

***

### ⚙️ DevOps / CI/CD
![Jenkins](https://img.shields.io/badge/Jenkins-CI--Pipeline-D24939?style=for-the-badge&logo=jenkins)
![Docker](https://img.shields.io/badge/Docker-Containerization-2496ED?style=for-the-badge&logo=docker)
![Kubernetes](https://img.shields.io/badge/Kubernetes-Orchestration-326CE5?style=for-the-badge&logo=kubernetes)
![Argo CD](https://img.shields.io/badge/ArgoCD-GitOps--Deploy-1976D2?style=for-the-badge&logo=argo)

***

### 🛠 Tools
![Git](https://img.shields.io/badge/Git-Version--Control-F05032?style=for-the-badge&logo=git)
![GitHub](https://img.shields.io/badge/GitHub-Repo--Hosting-181717?style=for-the-badge&logo=github)
![IntelliJ](https://img.shields.io/badge/IntelliJ--IDEA-Java--IDE-000000?style=for-the-badge&logo=intellijidea)
![VSCode](https://img.shields.io/badge/VS%20Code-Frontend--Dev-007ACC?style=for-the-badge&logo=visualstudiocode)
![Notion](https://img.shields.io/badge/Notion-Docs--&--WBS-000000?style=for-the-badge&logo=notion)

---

# 주요 기능

<details>
  <summary>회원가입</summary>

  #### 회원가입 화면
 ![회원가입](https://github.com/user-attachments/assets/2471a918-e3c4-4426-bfc3-ae09eab7ef68)

  #### 회원가입 이메일 인증 화면
![회원가입_이메일인증](https://github.com/user-attachments/assets/401e5996-2465-4f55-a416-a8c82a80924a)

</details>

<details>
  <summary>메인 페이지</summary>

  #### 메인 페이지 
  ![메인페이지](https://github.com/user-attachments/assets/2b6d6236-f586-44ba-bf58-17ca53e9f74d)

</details>

<details>
  <summary>모집 게시판</summary>
  
#### 모집 게시판 조회
![모집게시판](https://github.com/user-attachments/assets/cf7ebe08-8ba7-4364-8275-56275ced0188)

#### 모집 게시글 조회
![모집게시판_ 조회](https://github.com/user-attachments/assets/367ff2cb-0cfa-4c07-8301-32c61dd8d890)

#### 모집 게시글 작성
![모집게시판_작성](https://github.com/user-attachments/assets/c1921ee7-4080-4fea-8069-ad7916db1e33)

#### 모집 게시글 - 참여 신청
![모집게시판_신청](https://github.com/user-attachments/assets/17550946-52ed-4964-8296-86b1b576b6a7)

#### 모집 게시글 - 공동TO-DO방 생성
![모집게시판_공동방생성](https://github.com/user-attachments/assets/402d56d8-18f7-4659-826f-171345186ae3)

</details>

<details>
  <summary>개인 TO-DO</summary>
  
#### 개인 TO-DO
![개인투두_조회](https://github.com/user-attachments/assets/6ba4cfb0-206f-4ea0-971a-d6d2109493c8)

#### 개인 TO-DO 추가
![개인투두_투두추가](https://github.com/user-attachments/assets/5e36bad9-56d4-4762-b871-94436a9698af)

#### 개인 TO-DO 삭제
![개인투두_삭제png](https://github.com/user-attachments/assets/6c3042ca-973e-44a6-aa00-9343ee7683e0)

#### 개인 TO-DO - 카테고리 생성
![개인투도_카테고리생성](https://github.com/user-attachments/assets/071b064b-096e-4ef3-a5ac-ee3f756a2ed2)

#### 개인 TO-DO - 카테고리 삭제
![개인투두_카테고리삭제](https://github.com/user-attachments/assets/4ec4099c-b7d9-4d7b-93bf-c5959a23c03d)

#### 개인 TO-DO - 캘린더 채우기 + 성취도 표 조회
![캘린더 색깔 채우기 및 성취도 조회 ](https://github.com/user-attachments/assets/e3302d73-9e8d-4fc0-a6f7-11a77dd1452e)

#### 개인 TO-DO - TO-DO 공개 설정 (전체 공개 or 팔로우 공개)
![개인투두_팔로워공개로 변경](https://github.com/user-attachments/assets/be421940-bb28-49d7-847c-723825c5b425)

#### 개인 TO-DO - 핀 설정
![개인투두_핀설정](https://github.com/user-attachments/assets/ea1e85bc-d971-4c1f-ae1f-73b15134a7dc)

</details>

<details>
  <summary>공동 TO-DO</summary>
  
#### 공동 TO-DO 조회
![공통투두_조회](https://github.com/user-attachments/assets/cf12afc0-3100-4aae-bcbc-aca9e6c8f468)

#### 공동 TO-DO - AI를 통한 TO-DO 생성
![공통투두_AI를 통한 투두 생성](https://github.com/user-attachments/assets/43574dd1-d0ab-4ee5-9c6f-9cffcf535225)

#### 공동 TO-DO - 사용자 TO-DO 직접 생성
![공통투두_투두직접생성](https://github.com/user-attachments/assets/bc8b2d32-1799-4bbd-889f-194884eabc1a)

#### 공동 TO-DO - Appove 등록
![공동투두_Approve등록](https://github.com/user-attachments/assets/ae5c70a7-2970-4002-bf4d-4eddc3f46666)

#### 공동 TO-DO 조회 - Appove 수정
![공동투두_approve승인 수정](https://github.com/user-attachments/assets/71b98f42-3588-4d8c-b64c-254efa12954e)

#### 공동 TO-DO - 달력 채우기 및 표 성취도 조회
![공동투두_달력채우기 및 성취도 조회](https://github.com/user-attachments/assets/955d4942-2687-41d6-ba73-b839bb4fabbf)

#### 공동 TO-DO - 채팅
![공통투두_채팅](https://github.com/user-attachments/assets/f8479d96-3db2-4b4b-83ec-19b0692a4f87)

</details>


<details>
  <summary>회원 정보</summary>
  
#### 로그인
![로그인](https://github.com/user-attachments/assets/dfb9e957-03d4-40f0-89a9-058f3a5ad920)

#### 회원정보 수정 화면
![프로필_회원정보수정](https://github.com/user-attachments/assets/69bb354e-9099-4115-85a0-13a86724f8cc)

</details>

---


# UI/UX 설계

<details>
   <summary>🖼️ 와이어프레임 </summary>

  <details>
   <summary>로그인</summary>
   
   ![image](https://github.com/user-attachments/assets/0f252bb4-2aa8-459e-8c4a-cf12f8bde688)
   
</details>

<details>
   <summary>아이디 찾기</summary>

   ![image](https://github.com/user-attachments/assets/e117e946-5eb7-4bb9-9947-3933aef439f9)

   
   
</details>

<details>
   <summary>비밀번호 찾기</summary>
   
![image](https://github.com/user-attachments/assets/ac56aebf-a342-41a3-8f9d-b4e7c5098648)

   
</details>
<details>
   <summary>회원가입</summary>
   
   ![image](https://github.com/user-attachments/assets/fae950e9-7baf-470c-8bc8-86cbf1f0ecda)

</details>


<details>
   <summary>개인정보 수정</summary>

   ![image](https://github.com/user-attachments/assets/94d78326-f284-4d4f-ae71-c14a57398df0)

</details>

<details>
   <summary>팔로잉</summary>
   
   ![image](https://github.com/user-attachments/assets/fd67a622-e05f-4137-9f10-08a17fde3d2b)
   
</details>

<details>
   <summary>신고</summary>

![image](https://github.com/user-attachments/assets/ef8ccc64-e6f7-4db9-9c4e-27ded497fac7)
   
</details>

<details>
   <summary>팔로워 조회</summary>

![image](https://github.com/user-attachments/assets/68bf4cfb-7eb6-4dca-9db3-1e791ceb2958)
   
</details>


<details>
   
   <summary>팔로잉 조회</summary>
   
   ![image](https://github.com/user-attachments/assets/45dc297c-b497-41fd-a216-ff9693c091e1)
   
</details>

<details>
   <summary>todo추가</summary>
   
   ![image](https://github.com/user-attachments/assets/c6c7969d-0f8a-49bc-8905-b8a6cc74c654)

</details>

<details>
   <summary>todo 미완료</summary>

![image](https://github.com/user-attachments/assets/9af38271-9871-4427-8b46-e09c9ae0023b)
   
</details>

<details>
   <summary>DM 버튼</summary>

![image](https://github.com/user-attachments/assets/1d4e0f07-e775-4d9c-9b8a-2c36cf741f96)
   
</details>

<details>
   <summary>카테고리 설정</summary>

![image](https://github.com/user-attachments/assets/c40f4754-987d-4bf2-bcd0-e78b05b646a4)
   
</details>

<details>
   <summary>공동 TO-DO 생성</summary>
   
![image](https://github.com/user-attachments/assets/d28f9977-3974-4912-8b66-f094869401c6)
   
</details>


<details>
   <summary>공동 TO-DO APPROVE 요청</summary>
   
![image](https://github.com/user-attachments/assets/8d85927f-e764-4359-af69-adf528c332f1)
   
</details>

<details>
   <summary>모집게시판 조회</summary>
   
![image](https://github.com/user-attachments/assets/462459e4-b019-4f62-b3a6-0667d2a82402)
</details>

<details>
   <summary>공지사항 조회 - 회원</summary>

![image](https://github.com/user-attachments/assets/d433a1e7-1978-4560-a6c8-1e4064ea9422)
   
</details>

<details>
   <summary>공지사항 조회 - 관리자</summary>

![image](https://github.com/user-attachments/assets/50cdb4e8-8227-48a6-87ca-80b08295b3c2)
     
</details>

<details>
   <summary>DM 버튼</summary>

![image](https://github.com/user-attachments/assets/1d4e0f07-e775-4d9c-9b8a-2c36cf741f96)
   
</details>

<details>
   <summary>카테고리 설정</summary>

![image](https://github.com/user-attachments/assets/c40f4754-987d-4bf2-bcd0-e78b05b646a4)
   
</details>

<details>
   <summary>공동 TO-DO 생성</summary>
   
![image](https://github.com/user-attachments/assets/d28f9977-3974-4912-8b66-f094869401c6)
   
</details>


<details>
   <summary>공동 TO-DO APPROVE 요청</summary>
   
![image](https://github.com/user-attachments/assets/8d85927f-e764-4359-af69-adf528c332f1)
   
</details>

<details>
   <summary>모집게시판 조회</summary>
   
![image](https://github.com/user-attachments/assets/462459e4-b019-4f62-b3a6-0667d2a82402)
</details>

<details>
   <summary>공지사항 조회 - 회원</summary>

![image](https://github.com/user-attachments/assets/d433a1e7-1978-4560-a6c8-1e4064ea9422)
   
</details>

<details>
   <summary>공지사항 조회 - 관리자</summary>

![image](https://github.com/user-attachments/assets/50cdb4e8-8227-48a6-87ca-80b08295b3c2)
   
</details>

<details>
   <summary>공지사항 작성 - 관리자</summary>

![image](https://github.com/user-attachments/assets/7c71fd5e-696b-4156-ba71-b0c28f50875b)
   
</details>

<details>
   <summary>공지사항 수정 - 관리자</summary>
   
![image](https://github.com/user-attachments/assets/1cbd2de5-5606-4626-86ad-8eb8aef06adb)

</details>

<details>
   <summary>공지사항 삭제 - 관리자</summary>

![image](https://github.com/user-attachments/assets/c14398e3-d9e1-4add-93e0-f52c5175e21c)
</details>

<details>
   <summary>문의사항 조회 - 회원 </summary>

![image](https://github.com/user-attachments/assets/d4d6c6f3-c4ef-4521-a977-40fd9f947086)
</details>

<details>
   <summary>문의사항 조회 - 관리자</summary>

![image](https://github.com/user-attachments/assets/6770f08f-8340-4b87-9501-f795c1f71007)
</details>

<details>
   <summary>문의사항 수정 - 관리자</summary>

   ![image](https://github.com/user-attachments/assets/9905e26c-8c06-45aa-b10a-b05e837b9b16)
  
</details>

<details>
   <summary>문의사항 삭제 - 관리자</summary>

![image](https://github.com/user-attachments/assets/a3aae482-3258-4fa5-9656-4dff94afed66)
   
   
</details>

<details>
   <summary>문의사항 답변 - 관리자</summary>

![image](https://github.com/user-attachments/assets/80b26efc-6c9e-4b8c-a286-7a196945cad4)
   
</details>

</details>

---

# CI/CD 설계

<details>
   <summary>아키텍쳐</summary>
   
  ![systemarch](https://github.com/user-attachments/assets/27297ef1-f687-49a3-a9a3-c3f00c6bf6a1)

</details>

<details>
   <summary>젠킨스 파이프라인</summary>

```groovy
pipeline {
    agent any

    tools {
        gradle 'gradle'
        jdk 'openJDK17'
    }

    environment {
        GITHUB_URL = 'https://github.com/TEAM-DDIS/be14-4th-DDIS-BE.git'
    }

    stages {
        stage('Preparation') {
            steps {
                script {
                    if (isUnix()) {
                        sh 'docker --version'
                    } else {
                        bat 'docker --version'
                    }
                }
            }
        }

        stage('Source Build') {
            steps {
                git branch: 'dev', url: "${env.GITHUB_URL}"
                script {
                    if (isUnix()) {
                        sh "chmod +x ./DDIS_Project/gradlew"
                        sh "./DDIS_Project/gradlew clean build"
                    } else {
                        bat "cd DDIS_Project && gradlew.bat clean build -x test"
                    }
                }
            }
        }

        stage('Container Build and Push') {
            steps {
                script {
                    withCredentials([usernamePassword(credentialsId: 'DOCKERHUB_PASSWORD', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]) {
                        if (isUnix()) {
                            sh "docker build -f DDIS_Project/Dockerfile -t ${DOCKER_USER}/k8s_ddis_boot:${currentBuild.number} DDIS_Project"
                            sh "docker build -f DDIS_Project/Dockerfile -t ${DOCKER_USER}/k8s_ddis_boot:latest DDIS_Project"
                            sh "docker login -u ${DOCKER_USER} -p ${DOCKER_PASS}"
                            sh "docker push ${DOCKER_USER}/k8s_ddis_boot:${currentBuild.number}"
                            sh "docker push ${DOCKER_USER}/k8s_ddis_boot:latest"
                        } else {
                            bat "docker build -f DDIS_Project/Dockerfile -t ${DOCKER_USER}/k8s_ddis_boot:${currentBuild.number} DDIS_Project"
                            bat "docker build -f DDIS_Project/Dockerfile -t ${DOCKER_USER}/k8s_ddis_boot:latest DDIS_Project"
                            bat "docker login -u %DOCKER_USER% -p %DOCKER_PASS%"
                            bat "docker push ${DOCKER_USER}/k8s_ddis_boot:${currentBuild.number}"
                            bat "docker push ${DOCKER_USER}/k8s_ddis_boot:latest"
                        }
                    }
                }
            }
        }
    }

    post {
        always {
            script {
                if (isUnix()) {
                    sh 'docker logout'
                } else {
                    bat 'docker logout'
                }
            }
        }
        success {
            echo 'Pipeline succeeded!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}
```
 </details>
 
<details>
   <summary>아르고 파이프라인</summary>
   
   ```groovy
   pipeline {
    agent any

    tools {
        gradle 'gradle'
        jdk 'openJDK17'
    }

    environment {
        SOURCE_GITHUB_URL = 'https://github.com/TEAM-DDIS/be14-4th-DDIS-BE.git'
        MANIFESTS_GITHUB_URL = 'https://github.com/TEAM-DDIS/DDIS-manifests.git'
        GIT_USERNAME = 'tommy8969'
        GIT_EMAIL = 'tommy8969@naver.com'
    }

    stages {
        stage('Preparation') {
            steps {
                script {
                    if (isUnix()) {
                        sh 'docker --version'
                    } else {
                        bat 'docker --version'
                    }
                }
            }
        }

        stage('Source Build') {
            steps {
                git branch: 'dev', url: "${env.SOURCE_GITHUB_URL}"
                script {
                    if (isUnix()) {
                        sh "chmod +x ./DDIS_Project/gradlew"
                        sh "./DDIS_Project/gradlew clean build"
                    } else {
                        bat "cd DDIS_Project && gradlew.bat clean build -x test"
                    }
                }
            }
        }

        stage('Container Build and Push') {
            steps {
                script {
                    withCredentials([usernamePassword(credentialsId: 'DOCKERHUB_PASSWORD', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]) {
                        if (isUnix()) {
                            sh "docker build -f DDIS_Project/Dockerfile -t ${DOCKER_USER}/k8s_ddis_boot:${currentBuild.number} DDIS_Project"
                            sh "docker build -f DDIS_Project/Dockerfile -t ${DOCKER_USER}/k8s_ddis_boot:latest DDIS_Project"
                            sh "docker login -u ${DOCKER_USER} -p ${DOCKER_PASS}"
                            sh "docker push ${DOCKER_USER}/k8s_ddis_boot:${currentBuild.number}"
                            sh "docker push ${DOCKER_USER}/k8s_ddis_boot:latest"
                        } else {
                            bat "docker build -f DDIS_Project/Dockerfile -t ${DOCKER_USER}/k8s_ddis_boot:${currentBuild.number} DDIS_Project"
                            bat "docker build -f DDIS_Project/Dockerfile -t ${DOCKER_USER}/k8s_ddis_boot:latest DDIS_Project"
                            bat "docker login -u %DOCKER_USER% -p %DOCKER_PASS%"
                            bat "docker push ${DOCKER_USER}/k8s_ddis_boot:${currentBuild.number}"
                            bat "docker push ${DOCKER_USER}/k8s_ddis_boot:latest"
                        }
                    }
                }
            }
        }

        stage('K8S Manifest Update') {
            steps {
                git credentialsId: 'github',
                    url: "${env.MANIFESTS_GITHUB_URL}",
                    branch: 'main'

                script {
                    withCredentials([usernamePassword(credentialsId: 'github', usernameVariable: 'GIT_USER', passwordVariable: 'GIT_PASS')]) {
                        def githubUrl = env.MANIFESTS_GITHUB_URL.replace('https://', '')
                        if (isUnix()) {
                            sh "sed -i 's/k8s_ddis_boot:.*/k8s_ddis_boot:${currentBuild.number}/g' backend-deployment.yml"
                            sh "git add backend-deployment.yml"
                            sh "git config --global user.name '${env.GIT_USERNAME}'"
                            sh "git config --global user.email '${env.GIT_EMAIL}'"
                            sh "git commit -m '[UPDATE] ${currentBuild.number} image versioning'"
                            sh "git push https://${GIT_USER}:${GIT_PASS}@${githubUrl} main"
                        } else {
                            bat "powershell -Command \"(Get-Content backend-deployment.yml) -replace 'k8s_ddis_boot:.*', 'k8s_ddis_boot:${currentBuild.number}' | Set-Content backend-deployment.yml\""
                            bat "git add backend-deployment.yml"
                            bat "git config --global user.name '${env.GIT_USERNAME}'"
                            bat "git config --global user.email '${env.GIT_EMAIL}'"
                            bat "git commit -m \"[UPDATE] ${currentBuild.number} image versioning\""
                            bat "git push https://%GIT_USER%:%GIT_PASS%@${githubUrl} main"
                        }
                    }
                }
            }
        }
    }

    post {
        always {
            script {
                if (isUnix()) {
                    sh 'docker logout'
                } else {
                    bat 'docker logout'
                }
            }
        }
        success {
            echo 'Pipeline succeeded!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}
```
</details>

 <details>
   <summary>테스트 결과</summary>

   ![KakaoTalk_20250503_234028435](https://github.com/user-attachments/assets/d94547c8-b8e6-4604-ab9a-44c254cf9f4f)

 </details>

---

# 설계 문서  

## 전체 설계 문서
[📄 Google 전체 설계 문서 바로가기](https://docs.google.com/spreadsheets/d/1PUN3A37981MhDW54SWZep5-JsxbDLgIV7gaxJtn7848/edit?gid=0#gid=0)

## DDD
<details>
   <summary>Bounded Context</summary>
   <img width="916" alt="image" src="https://github.com/user-attachments/assets/fca502bf-17f7-4f4b-b541-d05762d14f97" />
</details>

<details>
   <summary>Context Map</summary>
   <img width="905" alt="image" src="https://github.com/user-attachments/assets/9620515e-b6cd-4f0a-aabd-26e0a349a971" />
</details>

## 모델링
<details>
   <summary>물리적 모델링</summary>
   <img width="876" alt="image" src="https://github.com/user-attachments/assets/43c71472-0693-447f-8d47-48728facacb5" />
</details>

   

---


## 팀원 회고
<details>

  <summary>이성준</summary>

### 📌 FACTS (사실, 객관)
- 이번 프로젝트에서 **공동 투두(ShareTodo)**와 **공동 방(Room)** 기능, 그리고 **Approve 시스템**의 백엔드와 프론트엔드를 모두 구현
- **공동 투두**는 팀원들이 공동의 목표를 설정하고 진행 상황을 공유할 수 있는 핵심 기능으로, 주 단위의 일정 생성과 체크 기능을 포함
- **Approve 시스템**은 방에서 생성된 TODO에 대해 승인 또는 거절을 관리하는 기능으로, 멤버 간의 협업을 강화하는 핵심 모듈


### 💭 FEELINGS (느낌, 주관)

- **공동 방**과 **공동 투두**는 서로의 **의존 관계**가 많아 **데이터 모델링**이 까다로웠음  
- **MemberShareTodo**와 **Approve 엔티티**의 관계 설정에서 **복합 키 문제**를 해결하는 과정이 큰 고비였음.
- 여러 명이 동시에 투두를 생성하고 수정하는 상황에서 **동시성 문제**를 해결하는 과정이 어려웠음.


### 🔍 FINDINGS (배운 것)

- **Pinia**를 활용한 **상태 관리**의 중요성을 다시 한번 체감했습니다. 상태가 잘 관리되지 않으면 **공동 방**의 복잡한 관계를 처리하는 데 큰 문제가 생길 수 있음을 배웠습니다.
- **MemberShareTodo**와 **Approve 엔티티**에서 **복합 키**와 **참조 무결성**의 중요성을 실감했습니다.
- **API 설계** 단계에서 **프론트엔드와의 협업**이 얼마나 중요한지도 깨달았습니다. 서로의 요구사항이 맞지 않으면 결국 코드 수정이 반복될 수밖에 없음을 알게 되었습니다.


### 🚀 FUTURE (미래)

- 앞으로는 공동 투두를 단순한 체크리스트가 아니라, **목표 달성률**과 **멤버별 기여도**를 시각화하는 시스템으로 확장 

- 현재는 단순한 승인/거절 구조지만, **다단계 승인 프로세스**나 **실시간 알림 시스템**을 추가하여 더 복잡한 협업 시나리오도 처리할 수 있는 방향으로 개선 
 

-  공동 방의 **멤버 관리**와 **역할 분배**를 더 쉽게 하기 위해 **역할별 권한 관리**와 **초대 링크 생성** 기능을 추가할 계획입니다.  
  또한, 방 내부의 **활동 로그**나 **히스토리 관리**를 통해 방의 **투명성**을 높이고자 합니다.

- 현재 **MemberShareTodo**와 **Approve** 엔티티의 복잡한 관계를 더 최적화하여 **데이터 일관성**을 강화할 계획 


- **대규모 공동 방**에서도 성능 저하가 없도록 **쿼리 최적화**하여 보다 **경량화된 데이터 모델**로 리팩토링할 생각입니다.
</details>

<details>

  <summary>한윤상</summary>

### 📌 FACTS (사실, 객관)

- 이번 프로젝트에서 신고 관리 기능, 팔로우 시스템, 그리고 **CI/CD 기반의 전체 배포 파이프라인**을 단독으로 설계하고 구현함.

- **신고 기능**은 게시글, 댓글, 사용자에 대해 중복 신고를 방지하고, 관리자 승인 여부를 처리할 수 있도록 설계함.

- **팔로우 기능**은 사용자 간의 상호 구독 관계를 관리하고, 마이페이지 내 활동 내역 조회에 반영됨.

- **Jenkins + DockerHub + ArgoCD + Kubernetes** 기반의 자동화된 배포 시스템을 구축해, 모든 백엔드/프론트엔드 컨테이너를 안정적으로 운영함.

### 💭 FEELINGS (느낌, 주관)

- **신고 시스템**은 단순해 보이지만, 신고 유형마다 처리 방식이 달라 구조를 일반화하는 데 어려움이 있었다.

- **팔로우 기능**은 실시간 UX 흐름과 데이터 무결성을 모두 만족시켜야 해 로직과 쿼리 설계에 많은 고민이 필요했다.

- 특히 **배포 자동화 파이프라인**을 혼자서 처음부터 끝까지 구성하면서 부담감도 있었지만, 그만큼 가장 성장할 수 있었던 영역이었다.

- DockerHub 인증 실패, ArgoCD manifest 연동 오류, Ingress 분기 문제 등 다양한 이슈를 직접 해결하며 **실전 DevOps 경험**을 쌓을 수 있었다.

### 🔍 FINDINGS (배운 것)

- **GitHub → Jenkins → DockerHub → GitHub(manifests) → ArgoCD → Kubernetes**로 이어지는 GitOps 기반 배포 파이프라인을 실제로 구현하며 전체 흐름을 완전히 이해하게 됨.

- **Secret/ConfigMap** 등 민감 정보 관리의 중요성과 실무 적용 방식을 체득함.

- 프로젝트에서 **인프라를 단독으로 맡는다는 것**은 부담이 클 수 있지만, 반대로 전체 아키텍처를 이해하고 통제하는 데 큰 도움이 된다는 것을 배움.

- 단순 CRUD처럼 보였던 **신고/팔로우 기능**도 사용자 흐름과 데이터 무결성을 고려하면 높은 설계 역량이 요구된다는 것을 깨달음.

### 🚀 FUTURE (미래)

- **신고 시스템**은 향후 단순 승인/거절 처리 외에도, **AI 기반 자동 필터링** 또는 **신고 우선순위 분류 시스템**으로 확장하고자 한다.

- **팔로우 시스템**은 피드 기능과 연동해 **팔로우 기반 콘텐츠 추천**이나 **활동 알림 시스템**으로 진화시킬 계획이다.

- Jenkins는 이미 GitHub Webhook으로 자동 빌드를 처리하고 있지만, 여기에 **Slack 알림**, **상태 모니터링 기능** 등을 추가하여 더 견고한 CI 환경으로 개선할 예정이다.

- 다음 프로젝트에서는 **AWS 기반 배포 환경**을 학습하고 직접 적용해보며, 클라우드 인프라 운영 역량을 실제로 갖추는 것을 목표로 한다.

- 이번 프로젝트를 통해 쌓은 **DevOps 실무 경험**을 바탕으로, 앞으로는 **클라우드 플랫폼 운영 능력과 백엔드 개발 역량**을 균형 있게 성장시킬 계획이다.
</details>

<details>

  <summary>고도연</summary>

  
### 📌 FACTS (사실, 객관)

- Websocket과 STOMP를 이용하여 공동 투두 빙의 멤버들이 자유롭게 소통할 수 있는 채팅을 구현하였다.

- 서비스 측면의 공지사항과 문의사항 관련 백엔드와 프론트엔드를 구현하였다.

### 💭 FEELINGS (느낌, 주관)

- 채팅은 처음 구현 해보는 기능이고 구현할 시간도 부족하여 많은 부담이 되었고 공부하고 적용하는 데 어려움이 있었다.

- 팀원들과 협동심을 발휘하여 프로젝트를 할 수 있었다. 다같이 힘든 상황에서 누구 하나 빠지지 않고 프로젝트를 위해 열정적으로 임하여 나도 더 자극 받고 열심히 할 수 있었다.

### 🔍 FINDINGS (배운 것)

- 기능: Websocket과 STOMP을 이용하면 다른 방법들 보다 채팅 기능을 구현하기 편리한 것을 알게 되었다.

- 복습: 이전 프로젝트들은 처음 배운 것들을 바로 적용시키다 보니 원하는 대로 잘 되지 않는 등 작은 기능 하나를 구현하는 것도 조금 버거웠었다. 하지만 이번 프로젝트에서는 그동안 배우고 복습한 내용들을 응용할 수 있어서 전보다 헤매지 않고 수월하게 구현할 수 있었다. 

- 협업: 협업이라는 큰 틀 안에는 많은 항목들이 존재 하지만 그 중에서도 팀원들 간의 협동심을 키울 수 있었다. 하지만 완성된 협업을 이루려면 다른 요소들이 더 필요함을 배웠다.

### 🚀 FUTURE (미래)

- 이번에 채팅을 구현할 때 기간이 부족했기 때문에 빠른 시일 내에 배우고 구현할 수 있도록 쉬운 방법을 택하였다. 무지한 상황에서 구현이 되어 만족스럽기도 하지만 아쉬운 부분들도 많이 보인다. 다음 프로젝트에 채팅 기능이 들어간다면 Websocket + STOMP 방식 이외에도 메시지 패싱 등 더 다양한 방법을 공부하고 적용할 수 있었으면 좋겠다. 

- 협업 측면에서 보았을 때, 다음 프로젝트에서는 소통을 중심으로 하여 팀원 모두가 만족할 수 있는 프로젝트가 될 수 있었으면 좋겠다!
</details>

<details>

  <summary>강이도은</summary>


### 📌 FACTS (사실, 객관)
이번 프로젝트는 개인과 공동으로 사용할 수 있는 Todo 관리 웹사이트를 만드는 것이 목표였다. 전반적인 UI 설계와 Figma 디자인, GitHub 관리, 개인 Todo 기능의 백엔드 및 프론트엔드 개발을 맡았다.

- 개인 Todo는 사용자 메인 페이지처럼 동작하도록 설계하여, 한 화면 내에서 카테고리 관리, 일자별 Todo, 통계 시각화 등 많은 기능이 통합되었다.
  
- 이로 인해 UI/UX 설계 난이도가 꽤 높았고, 직접 구현하면서 웹에서의 드래그 앤 드롭, 스와이프 제스처, 차트 시각화 등 다양한 라이브러리를 사용해보았다.
  
- 개인 Todo의 데이터 구조는 `개인 Todo`, `일자별 Todo`, `카테고리` 세 테이블이 얽혀 있어 DDL 작성이 까다로웠고, 구조를 정밀하게 짜는 데 어려움을 느꼈다. 

### 💭 FEELINGS (느낌, 주관)
- 처음 내 아이디어가 프로젝트로 채택됐을 땐 정말 설레고 뿌듯했다.
  
- 직접 구상한 아이디어를 실제로 구현한다는 게 즐거우면서도, 동시에 책임감도 많이 느껴졌다.
  
- 특히 개인 Todo 화면은 너무 많은 기능이 들어가서, UX 측면에서 설계하기가 생각보다 어려웠고, 실제로 그것을 구현해내는 과정에서 어려움도 많았지만, 동시에 성취감도 컸다.
  
- 다양한 프론트엔드 라이브러리를 적용해보면서 "아, 나도 이런 걸 해낼 수 있구나" 하는 자신감도 얻었다.
  
- 반면, 기획을 너무 빨리 끝내고 싶다는 마음에 세부적인 설계 없이 넘어갔던 부분은 개발 중 발목을 잡았고, 협업 중 **서로 다른 이해**가 생기면서 속도도 느려져 아쉬움이 남았다.

그래도 여러 난관들을 거치면서 하나씩 완성해나갈 때마다 성취감이 컸고, 개발자로서 한 걸음 더 나아간 기분이 들었다.

### 🔍 FINDINGS (배운 것)
 - 기획은 ‘빠르게’보다는 ‘정확하게’가 더 중요하다. 불완전한 기획은 결국 개발 과정에서 발목을 잡는다.
 
- 하나의 화면에 많은 기능을 담을 때는 정보 구조와 사용자의 흐름을 더 깊이 있게 고민해야 한다는 것을 배웠다.
  
- 다양한 프론트엔드 라이브러리를 직접 다뤄보면서 기술적 자신감이 생겼고, 앞으로 더 도전해보고 싶은 욕심도 생겼다.
  
- Spring Security와 프론트 연동 시 발생하는 CORS, 인증 문제에 대해 실질적인 해결 방법을 익혔다. 단순히 작동하게 만드는 것뿐 아니라, 보안성과 확장성을 고려한 설정이 필요하다는 걸 느꼈다.
  
- 테이블 간 관계가 얽힌 구조에선 DDL을 정교하게 짜는 것이 핵심이며, 이를 위해 스스로 더 많은 데이터베이스 이해가 필요하다는 것을 느꼈다.
  
### 🚀 FUTURE (미래)
- Todo 통계를 좀 더 다양하게 보여주고 싶고, 공동 Todo랑 합쳐 개인 대시보드 화면을 만들고 싶다.
  
- UX 설계 시 사용자 입장에서 정보의 우선순위를 정하고, 복잡한 기능일수록 흐름을 단순하게 만들도록 고민할 것이다.
  
- 보안 관련 설정(Spring Security 등)을 프로젝트 초반부터 제대로 이해하고 계획할 것이다.
  
 - 무엇보다, 빠르게 결과를 내기보다는 꼼꼼하고 단단한 시작이 더 나은 끝을 만든다는 걸 이번 프로젝트를 통해 뼈저리게 느꼈기에, 그 교훈을 꼭 다음에도 살리고 싶다.
</details>

<details>
  <summary>김기종</summary>

### 📌 FACTS (사실, 객관)
- Spring Security 기반 JWT 인증 시스템을 설계하고 구현하였다.

- 로그인 시 AccessToken과 RefreshToken을 발급하고, 토큰 만료 시 재발급이 가능하도록 RefreshToken을 Redis에 저장하였다.

- 이메일 인증 기능은 SMTP 서버를 통해 인증 메일을 발송하고, 사용자가 입력한 인증 코드를 Redis에 저장된 값과 비교해 유효성을 검증하도록 설계하였다.

- JWT 내부에 사용자 정보를 포함해, 각 사용자마다 다른 권한(Role)에 따라 접근 가능한 자원을 구분하도록 설계함.

- 프론트엔드(Vue 기반)와의 협업에서 Pinia 상태관리 라이브러리를 활용해 토큰을 안전하게 저장하고, Axios 인터셉터를 이용해 모든 요청에 자동으로 토큰을 포함시키도록 연동하였다.

### 💭 FEELINGS (느낌, 주관)
- 보안이라는 주제는 신중한 설계와 철저한 테스트가 필요했기 때문에 도전적인 과제였지만, 구현 후 안정적으로 동작하는 결과물을 보며 큰 성취감을 느꼈다.

- Redis와 SMTP, JWT와 같은 다양한 기술 스택을 연결하는 과정에서 이메일 인증 과정과 token 인증 방식에 대해 알 수 있게 된 점이 좋았다. 

- 다만, 일정 문제로 소셜 로그인 기능(Google, Kakao 등)을 구현하지 못한 점과, 프론트엔드 UI/UX 세심하게 구현하지 못한 게 아쉬움으로 남았다.

### 🔍 FINDINGS (배운 것)
- JWT 기반 인증 흐름 전반(토큰 발급 → 인증 → 재발급 → 로그아웃)에 대한 깊은 이해를 갖게 되었고, 토큰 만료 전략과 보안 강화 방안 (예: HttpOnly 쿠키 분리 저장 등) 도 실무적으로 고려하게 되었다.

- Redis를 인증 코드 저장소로 사용하면서 TTL(Time To Live)을 활용한 인증 유효시간 설정, 비동기 처리의 중요성 등 성능 및 보안 관점에서의 학습이 있었다.

- SMTP 서버 설정부터 이메일 전송 실패 대응까지 실제 운영 환경에서 필요한 로직을 직접 다뤄본 경험을 얻었다.

- 프론트엔드와의 협업 과정에서, CORS, 인증 상태에 따른 예외 처리, 인증 실패 시 사용자 피드백 설계 등 실무적으로 중요한 포인트를 체감했다.

### 🚀 FUTURE (미래)
- 구현하지 못한 소셜 로그인 기능(Google, Kakao 등) 을 추가해 사용자 인증 수단을 다양화하고, OAuth2 기반 인증 전략까지 적용할 예정이다.

- 프론트엔드 기술에 대한 이해도를 높여, 인증 흐름을 포함한 UI/UX 설계 및 사용자 편의성까지 고려할 수 있는 백엔드 개발자로 성장하고자 한다.

- Spring Cloud Gateway 및 OAuth2 Authorization Server 도입을 통해 MSA 환경에서의 인증 구조 설계 및 보안 강화를 시도할 계획이다.

- JWT, Redis, SMTP 등에서 쌓은 실무 경험을 바탕으로, DevOps 및 클라우드 환경에 대한 실전 배포 역량까지 함께 성장시키려 한다.

- 장기적으로는 보안성과 사용성, 서비스 구조를 함께 고려할 수 있는 풀스택 성향의 백엔드 개발자를 목표로 하고 있다.
  
</details>

<details>
    <summary>주아현</summary>
  
### 📌 FACTS (사실, 객관)
- 모집 게시글 기능을 Spring Boot로 구현하며 백엔드의 주요 로직을 담당했다.

- Vue.js 프론트엔드와의 연동을 통해 게시글 등록, 수정, 조회 기능을 완성했다.

- UI 개발도 직접 수행하며 사용자 경험을 고려한 화면 설계와 스타일링을 병행했다.

### 💭 FEELINGS (느낌, 주관)
- 협업 프로젝트는 개인이 잘하는 것보다, 모든 팀원이 함께 결과물을 만들어내는 것이 중요하다고 느꼈다.

- 모집 게시글 기능과 공동 Todo방 기능은 긴밀하게 연결되어 있어, 사전 기획 및 소통이 매우 중요하다는 걸 체감했다.

- Redis를 활용해 해시태그 기능을 구현하고 싶었지만, 우선순위 및 일정 문제로 도입하지 못해 아쉬움이 남았다.

- 각자 맡은 역할 외에도 서로 도와야 하는 상황이 많았고, 협업이 단순한 역할 분담이 아님을 깨달았다.

### 🔍 FINDINGS (배운 것)
- 협업의 가장 핵심은 지속적인 소통과 피드백이라는 것을 배웠다.

- 코딩 중 막히는 부분이 있을 때는 혼자 오래 고민하기보다는 빠르게 물어보고 해결하는 적극적인 태도가 중요하다는 걸 깨달았다.

- 백엔드와 프론트엔드 연동 과정에서 실제 사용자 요청 흐름을 고려한 API 설계 능력이 성장했다.

- CORS 에러를 직접 마주하고 해결하며, 인증 및 보안 설정이 단순한 기능 구현보다 더 복잡하고 중요하다는 것을 배웠다.

### 🚀 FUTURE (미래)
- 앞으로는 새로운 기술을 두려워하기보다 실제 프로젝트에 직접 적용해보며 체득하는 방식으로 성장하고자 한다.

- Redis, JWT, OAuth2 등 아직 도전하지 못한 기술들에 대해 작은 기능이라도 적용해보는 실험정신을 가지고 학습할 계획이다.

- 프론트엔드와 백엔드 모두 아우르는 풀스택적인 사고를 갖기 위해 기획 단계부터 기능 흐름 전체를 이해하려는 노력을 계속할 것이다.

</details>
