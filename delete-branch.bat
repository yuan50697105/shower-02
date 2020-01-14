for %%i in (1,2,3,4,5,6,7,8) do (
    for %%a in (dev-app-project-0,dev-app-project-jpa-0,dev-module-app-project-0,dev-module-app-project-jpa-0) do (
        REM call git checkout -b %%a%%i 
        REM call git pull origin dev
        REM git push origin --delete %%a%%i
        git branch -D %%a%%i
    )
)
REM call git push --all