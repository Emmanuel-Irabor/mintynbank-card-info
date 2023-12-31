package com.mintynbank.channels.mintynbankcardinfo.repository.customer.param;

import com.mintynbank.channels.mintynbankcardinfo.common.enums.CustomerRoleEnum;
import lombok.Data;

/**
 * @author Emmanuel-Irabor
 * @since 27/12/2023
 */
@Data
public class CustomerRegistrationServiceParam {

    private String firstName;

    private String lastName;

    private String email;

    private String phoneNumber;

    private String password;

    private CustomerRoleEnum role;
}
