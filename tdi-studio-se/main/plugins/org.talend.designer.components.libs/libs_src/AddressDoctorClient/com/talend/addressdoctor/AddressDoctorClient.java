package com.talend.addressdoctor;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.AddressDoctor.validator2.addInteractive.Interactive.AddInteractiveRequest;
import com.AddressDoctor.validator2.addInteractive.Interactive.AddInteractiveResponse;
import com.AddressDoctor.validator2.addInteractive.Interactive.Address;
import com.AddressDoctor.validator2.addInteractive.Interactive.Authentication;
import com.AddressDoctor.validator2.addInteractive.Interactive.CapitalizationType;
import com.AddressDoctor.validator2.addInteractive.Interactive.CountryOfOriginType;
import com.AddressDoctor.validator2.addInteractive.Interactive.CountryType;
import com.AddressDoctor.validator2.addInteractive.Interactive.InteractiveSoap;
import com.AddressDoctor.validator2.addInteractive.Interactive.LineSeparatorType;
import com.AddressDoctor.validator2.addInteractive.Interactive.Parameters;
import com.AddressDoctor.validator2.addInteractive.Interactive.PreferredLanguageType;
import com.AddressDoctor.validator2.addInteractive.Interactive.Result;

public class AddressDoctorClient {

    /**
     * This is old API, via "DeliveryAddressLines" to transmit the input data to the server
     * 
     * @see: bug:6025
     * @param args
     * @throws Exception
     */
    public static Result[] formatAndValidate(Long userId, String password, String addressLines,
            CountryOfOriginType originCountry, CountryType countryType, LineSeparatorType lineSeparator,
            CapitalizationType capitalize) throws Exception {
        try {
            // Parameter to set in component
            // String webServiceURI (should always be
            // http://validator2.addressdoctor.com/addInteractive/Interactive.asmx) -> no parameter for this

            InteractiveSoap interactiveSoap = (new com.AddressDoctor.validator2.addInteractive.Interactive.InteractiveLocator())
                    .getInteractiveSoap();
            AddInteractiveRequest addInteractiveRequest = new AddInteractiveRequest();

            Parameters parameters = new Parameters();
            Address address = new Address();

            // set address with input row fixed schema
            address.setDeliveryAddressLines(addressLines);
            addInteractiveRequest.setAddress(address);
            // Advanced Parameter Settings
            parameters.setCountryOfOrigin(originCountry);
            parameters.setCountryType(countryType);
            parameters.setLineSeparator(lineSeparator);
            parameters.setCapitalization(capitalize);
            parameters.setPreferredLanguage(PreferredLanguageType.PFL_PRIMARY);
            addInteractiveRequest.setParameters(parameters);

            // web service call
            addInteractiveRequest.setAuthentication(new Authentication(userId, 0, password));
            AddInteractiveResponse resp = interactiveSoap.validate(addInteractiveRequest);

            Result[] results = resp.getResults();
            if (resp.getResultCount() > 0) {
                return results;
            } else {
                throw new Exception(resp.getErrorCode() + ":" + resp.getErrorMessage() + ":" + resp.getValidationStatus());
            }
        } catch (ServiceException e) {
            throw e;
        } catch (RemoteException e) {
            throw e;
        }
    }

    /**
     * This is new API, let user to define a structured data "Address" to transmit to the server
     * 
     * @see: bug:6025
     * @param args
     * @throws Exception
     */
    public static AddInteractiveResponse formatAndValidate(Long userId, String password, Address address,
            CountryOfOriginType originCountry, CountryType countryType, LineSeparatorType lineSeparator,
            CapitalizationType capitalize) throws Exception {
        try {
            // Parameter to set in component
            // String webServiceURI (should always be
            // http://validator2.addressdoctor.com/addInteractive/Interactive.asmx) -> no parameter for this

            InteractiveSoap interactiveSoap = (new com.AddressDoctor.validator2.addInteractive.Interactive.InteractiveLocator())
                    .getInteractiveSoap();
            AddInteractiveRequest addInteractiveRequest = new AddInteractiveRequest();

            Parameters parameters = new Parameters();

            addInteractiveRequest.setAddress(address);
            // Advanced Parameter Settings
            parameters.setCountryOfOrigin(originCountry);
            parameters.setCountryType(countryType);
            parameters.setLineSeparator(lineSeparator);
            parameters.setCapitalization(capitalize);
            parameters.setPreferredLanguage(PreferredLanguageType.PFL_PRIMARY);
            addInteractiveRequest.setParameters(parameters);

            // web service call
            addInteractiveRequest.setAuthentication(new Authentication(userId, 0, password));
            AddInteractiveResponse resp = interactiveSoap.validate(addInteractiveRequest);

            return resp;

        } catch (ServiceException e) {
            throw e;
        } catch (RemoteException e) {
            throw e;
        }
    }
}

// for (Result result : results) {
//
// // set output row fixed schema with address
// System.out.println("Formatted Address : " + result.getAddress().getFormattedAddress());
//
// System.out.println("Contact : " + result.getAddress().getContact());
// System.out.println("Departement : " + result.getAddress().getDepartment());
// System.out.println("Org : "+result.getAddress().getOrganization());
// System.out.println("Delivery Address Lines : "+result.getAddress().getDeliveryAddressLines());
// System.out.println("Building : "+result.getAddress().getBuilding());
// System.out.println("House Number : "+result.getAddress().getHouseNumber());
// System.out.println("Street : "+result.getAddress().getStreet());
// System.out.println("Postal Code : "+result.getAddress().getPostalCode());
// System.out.println("Locality : "+result.getAddress().getLocality());
// System.out.println("Country Speicific Locality Line : "+result.getAddress().getCountrySpecificLocalityLine());
// System.out.println("POBox : "+result.getAddress().getPOBox());
// System.out.println("Province : "+result.getAddress().getProvince());
// System.out.println("Country : "+result.getAddress().getCountry());
// }
