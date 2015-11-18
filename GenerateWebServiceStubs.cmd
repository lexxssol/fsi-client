mkdir .tmp

wsimport.exe -Xnocompile -d .tmp -keep -p com.sheerimagination.businessobject.fulfillment.fsi.orders.api -wsdllocation file:fsi.orders.wsdl wsdl/fsi.orders.wsdl

wsimport.exe -Xnocompile -d .tmp -keep -p com.sheerimagination.businessobject.fulfillment.fsi.orderstatus.api -wsdllocation file:fsi.order.status.wsdl wsdl/fsi.order.status.wsdl

wsimport.exe -Xnocompile -d .tmp -keep -p com.sheerimagination.businessobject.fulfillment.fsi.inventory.api -wsdllocation file:fsi.inventory.wsdl wsdl/fsi.inventory.wsdl

xcopy .tmp\*.java src /E /Y

rmdir .tmp /S /Q