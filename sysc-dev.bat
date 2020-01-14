for %%i in (1,2,3,4,5,6,7,8) do (
    for %%a in (dev-app-0,dev-app-jpa-0,dev-module-app-0,dev-module-app-jpa-0) do (
        call git switch %%a%%i 
        call git pull origin dev
    )
)
REM call git push --all