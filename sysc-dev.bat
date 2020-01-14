for %%i in (1,2,3,4,5,6,7,8) do (
    for %%a in (webmvc-app-project-0,webmvc-app-project-jpa-0,webmvc-module-app-project-0,webmvc-module-app-project-jpa-0) do (
        call git checkout -b %%a%%i 
        call git pull origin dev
    )
)
REM call git push --all