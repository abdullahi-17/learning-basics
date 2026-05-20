# DevSecOps CI/CD Pipeline
 
A security-integrated CI/CD pipeline built on self-hosted Ubuntu VMs using Jenkins, Docker, Snyk, SonarQube, Trivy, and OWASP ZAP.
 
---
 
## What It Does
 
Automatically builds, scans, and deploys a Node.js application on every GitHub push. Security is integrated at every stage — source code, dependencies, container image, and runtime — before anything reaches production.
 
---
 
## Infrastructure
 
| Host | IP | Role |
|---|---|---|
| jenkins-server02 | 192.168.2.50 | Jenkins Master (Dockerized) |
| appserver01 | 192.168.2.51 | Jenkins Agent + SonarQube |
 
---
 
## Pipeline Stages
 
1. **SCM Checkout** — pulls latest code from GitHub via webhook
2. **SAST** — Snyk scans source code for vulnerabilities
3. **SCA** — Snyk scans dependencies for known CVEs
4. **Code Quality** — SonarQube analysis with quality gate enforcement
5. **Docker Build** — builds container image from Dockerfile
6. **Image Scan** — Trivy scans image for OS and library vulnerabilities
7. **Push** — verified image pushed to DockerHub
8. **DAST** — OWASP ZAP actively scans the running application
9. **Deploy** — docker-compose redeploys the updated container
---
 
## Security Tools
 
| Tool | Type | Purpose |
|---|---|---|
| Snyk | SAST + SCA | Code and dependency vulnerability scanning |
| SonarQube | SAST | Code quality and OWASP Top 10 coverage |
| Trivy | Image Scanning | CVE detection in Docker image layers |
| OWASP ZAP | DAST | Runtime vulnerability testing |
 
---
 
## Stack
 
Jenkins · Docker · Docker Compose · Snyk · SonarQube · PostgreSQL · Trivy · OWASP ZAP · GitHub · DockerHub · Ubuntu · Bash · Node.js
 
---
 
## Key Concepts Demonstrated
 
- Shift-Left security — vulnerabilities caught before build, not after deployment
- Jenkins master/agent architecture with systemd auto-recovery
- Pipeline as Code via Jenkinsfile
- Multi-stage security testing (SAST, SCA, image scan, DAST)
- Automated container delivery to DockerHub
---
